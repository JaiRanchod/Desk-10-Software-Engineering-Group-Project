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
    this.user_id = '6079779914e77ba9e7f43b9e';
    this.user_profile = {"_id":"6079779914e77ba9e7f43b9e","Age":24,"Bio":"blah blah","First Name":"Andreas","Gender":"male","Location":"London","Phone Number":"0000000","Preferred Name":"Andreas","Religion":"Religion","Surname":"Phili","University Course":"foo","dislike":[],"like":[]}

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
