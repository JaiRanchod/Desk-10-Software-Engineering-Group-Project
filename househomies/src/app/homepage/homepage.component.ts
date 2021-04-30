import { Component, OnInit, ChangeDetectorRef } from '@angular/core';

//Profile interface. Similar to mongoose model but for angular
import { Profile } from '../interfaces/Profile';

//Import the API service into homepage component
import { ApiService } from '../services/api.service';

import { UserService } from '../services/user.service';

import {
  trigger,
  state,
  style,
  animate,
  transition,
  // ...
} from '@angular/animations';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css'],

  //animations
  animations: [
    trigger('viewInOut', [
      //transition when created
      transition(':enter', [
        //go from opacity 0
        style({ opacity: 0 }),
        //final is opacity 1 over 0.5s
        animate('500ms', style({ opacity: 1 })),
      ]),

      //two dummy states
      state('yes', style({})),
      state('no', style({})),

      //transition from yes to destroy
      transition('yes => void', [
        //fly to the right and disapear
        animate('500ms ease-out', style({transform: 'translateX(100%)', opacity: 0}))
      ]),
      //transition from no to destory
      transition('no => void', [ 
        //fly to the left and disapear
        animate('500ms ease-out', style({transform: 'translateX(-100%)', opacity: 0})),
      ])
    ])
  ]
})
export class HomepageComponent implements OnInit {

  //all profiles
  profiles: Profile[];
  
  //index of current card
  cur_card_index: number;

  //current card
  cur_card: Profile;
  
  //if matched to the card shown
  matched: boolean;

  //current user's profile
  user_profile: Profile;

  //matched profile 
  matched_profile

  //initalize api service
  constructor(private api: ApiService, private changeDetector: ChangeDetectorRef,
              private user: UserService) { }

  ngOnInit(): void {
    this.retrieveData();
  }

  retrieveData()
  {
    //initalize variables
    this.matched = true;
    this.matched_profile = null;
    this.cur_card_index = 0;
    this.user_profile = this.user.get_profile();
    this.profiles = this.user.get_all_profiles();
    if(this.user_profile && this.profiles){
      this.choose_card();
    }

    this.user.getAll();
    this.user.$user_profile.subscribe((cur_profile:Profile) => {
      this.user_profile = cur_profile;
      this.profiles = this.user.get_all_profiles();
      this.choose_card();
    })
  }

  choose_card(){
    this.cur_card_index = this.choose_card_index(this.cur_card_index);
    if(this.cur_card_index == -1){
      this.cur_card == null;
    }else{
      this.cur_card = this.profiles[this.cur_card_index];
    }
    this.cur_card_index++;
  }

  choose_card_index(index: number): number {
    let len = this.profiles.length;
    let counter = 0;
    while(counter < len){
      let i = (index + counter) % len
      counter++;
      if(this.profiles[i]._id == this.user_profile._id){
        continue;
      }else if(this.user_profile.like.includes(this.profiles[i]._id)){
        continue;
      }else if(this.user_profile.dislike.includes(this.profiles[i]._id)){
        continue;
      }else{
        return i;
      }
    }

    return -1;
  }


  //this method is called when event emitter in card.componet emits an event
  on_results(event: boolean): void{
    //TODO: send things to database to retrieve matching 

    //set matched to equal either true or false
    this.matched = event;

    //if true 
    if(this.matched){
      //update the user profile to include cur card in like
      this.user_profile.like.push(this.cur_card._id);
      //match if they both like each other
      if(this.cur_card.like.includes(this.user_profile._id)){
        //add profile to matched profile for popup
        this.matched_profile = this.cur_card;
      }
      //send post request
      this.api.post_like(this.cur_card._id, this.user_profile._id).subscribe((res) => {
        console.log(res);
      });
    }else{
      //add the profile to cur_users dislike
      this.user_profile.dislike.push(this.cur_card._id);
      //send post request for dislike
      this.api.post_dislike(this.cur_card._id, this.user_profile._id).subscribe((res) => {
        console.log(res);
      });
    }
    //detect changes for this component to set the animation state
    this.changeDetector.detectChanges()
    //helper method
    this.reload_card();
  }

  //helper method
  reload_card(){
    //delete the current card component
    this.cur_card = null;
    //detect changes
    this.changeDetector.detectChanges()

    //get the new index for the next profile. The profiles currently repeat once they reach the end
    this.choose_card();
  }

  exit_popup(){
    this.matched_profile = null;
  }

}

