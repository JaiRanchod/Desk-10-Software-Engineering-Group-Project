import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { ApiService } from '../services/api.service';
import { Profile } from '../interfaces/Profile';
import { DataService } from '../services/data.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user_id: string;
  $user_profile: Subject<Profile>;
  user_profile: Profile; 
  profiles: Profile[];
  

  constructor(private api: ApiService, private dataService: DataService) { 
    this.$user_profile = new Subject<Profile>();
    this.dataService.getAll().subscribe(
      data => {
        this.user_id = data[0]._id;
        this.user_profile = {"_id":data[0]._id,"Age":data[0].Age,"Bio":data[0].Bio,"First Name":data[0]["First Name"],"Gender":data[0].Gender,"Location":data[0].Location,"Phone Number":data[0]["Phone Number"],"Image":data[0].Image,"Preferred Name":data[0]["Preferred Name"],"Religion":data[0].Religion,"Surname":data[0].Surname,"University Course":data[0]["University Course"],"dislike":[],"like":[]}
      }
    )


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
