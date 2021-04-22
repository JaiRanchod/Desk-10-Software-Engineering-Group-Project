import { Component, OnInit, ChangeDetectorRef } from '@angular/core';

//Profile interface. Similar to mongoose model but for angular
import { Profile } from '../interfaces/Profile';

//Import the API service into homepage component
import { ApiService } from '../services/api.service';

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
  profile: Profile[];
  
  //index of current card
  cur_card_index: number;

  //current card
  cur_card: Profile;
  
  //if matched to the card shown
  matched: boolean;


  //initalize api service
  constructor(private api: ApiService, private changeDetector: ChangeDetectorRef) { }

  ngOnInit(): void {

    //initalize variables
    this.matched = true;
    this.cur_card_index = 0;

    //call the service to get results from api
    this.api.get_cards().subscribe(
      //called when http returns a result. Cast to profile interface
      (data: Profile[]) => {
        //set data to profile array
        this.profile = data;
        //set cur card to the index
        this.cur_card = this.profile[this.cur_card_index];
      }
    )
  }

  //this method is called when event emitter in card.componet emits an event
  on_results(event: boolean): void{
    //TODO: send things to database to retrieve matching 

    //set matched to equal either true or false
    this.matched = event;
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
    this.cur_card_index = (this.cur_card_index + 1)%this.profile.length;
    //set the current card to the new index
    this.cur_card = this.profile[this.cur_card_index];
  }

}
