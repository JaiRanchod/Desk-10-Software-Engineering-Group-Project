import { Component, OnInit } from '@angular/core';
import { Profile } from '../interfaces/Profile';
import { ApiService } from '../services/api.service';
import { UserService } from '../services/user.service';

@Component({
    selector: 'app-matching',
    templateUrl: './matches.component.html',
    styleUrls: ['./matches.component.css']
})

export class MatchingComponent implements OnInit {
  matches: Profile[];
  profiles: Profile[];
  user_profile: Profile;

  constructor(private api: ApiService, private user: UserService) { }

  ngOnInit() {

    //create callback when user changes
    this.user.$user_profile.subscribe((profile: Profile) => {
      //get all the profiles again 
      this.profiles = this.user.get_all_profiles();
      //set the new user profile
      this.user_profile = profile;
      //call local method get_matches
      this.get_matches();
    })

    //get user profiles and all profiles 
    this.profiles = this.user.get_all_profiles();
    this.user_profile = this.user.get_profile();
    //if both are not null find the matches for user profile
    if(this.user_profile && this.profiles){
      this.get_matches()
    }
  }

  //find which are matching
  get_matches(): void {
    //initalize empty array
    this.matches = [];
    for(let i = 0; i < this.profiles.length; i++){
      //if both have each other's _ids inside their liked array it's a match
      if(this.profiles[i].like.includes(this.user_profile._id) &&
         this.user_profile.like.includes(this.profiles[i]._id)){

        //pushed matched profile into matches
        this.matches.push(this.profiles[i]);
      }

    }
  }
}
