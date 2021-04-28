import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { ApiService } from '../services/api.service';
import { Profile } from '../interfaces/Profile';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user_id: string;
  $user_profile: Subject<Profile>;
  user_profile: Profile; 
  profiles: Profile[];
  

  constructor(private api: ApiService) { 
    this.$user_profile = new Subject<Profile>();
    this.user_id = '60892fffc145b4f92a975cdb';
    this.user_profile = {"_id":"60892fffc145b4f92a975cdb","Age":18,"Bio":"test1","First Name":"test1","Gender":"male","Location":"Clifton","Phone Number":"447400123040","Preferred Name":"test1","Religion":"Christianity","Surname":"test1","University Course":"test1","dislike":[],"like":[]}

    this.api.get_cards().subscribe((profiles: Profile[]) => {
      this.profiles = profiles;
      for(let i = 0; i < profiles.length; i++) {
        if(profiles[i]._id == this.user_id) {
          this.user_profile = profiles[i];
          this.$user_profile.next(this.user_profile);
        }
      }
    })

  }

  set_id(new_id: string): void{
    this.user_id = new_id;
    this.api.get_cards().subscribe((profiles: Profile[]) => {
      this.profiles = profiles;
      for(let i = 0; i < profiles.length; i++) {
        if(profiles[i]._id == this.user_id) {
          this.user_profile = profiles[i];
          this.$user_profile.next(this.user_profile);
        }
      }
    })
  }

  get_profile(): Profile{
    return this.user_profile;
  }

  get_all_profiles(): Profile[] {
    return this.profiles;
  }

}
