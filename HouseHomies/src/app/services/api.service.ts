import { Injectable } from '@angular/core';
//Import module needed to call your api. Calls are made through http requests
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }


  //method to call api
  get_cards(){
    return this.http.get('/api/UserProfiles');
  }

  //method call to call userprofile like api
  post_like(match_id: string, cur_id: string){
    return this.http.post('/api/UserProfilesLike', {"_id": match_id}, {params: {_id: cur_id}}) 
  }
  //method call to call userprofile dislike api
  post_dislike(match_id: string, cur_id: string){
    return this.http.post('/api/UserProfilesDislike', {"_id": match_id}, {params: {_id: cur_id}}) 
  }

  post_update(cur_id: string, newPreferredName: string, newLocation: string, newGender: string, newAge: string, newPhoneNumber: string, newUniCourse: string, newBio: string, newFirstName: string, newLastName: string, newReligion: string, newBudget: string, newPersonality: string){
    return this.http.post('/api/UserProfilesUpdate' + "/" + cur_id, {
      "PreferredName": newPreferredName,
      "Age": newAge,
      "Bio": newBio,
      "Gender": newGender,
      "Location": newLocation,
      "UniversityCourse": newUniCourse,
      "PhoneNumber": newPhoneNumber,
      "FirstName": newFirstName,
      "LastName": newLastName,
      "Religion": newReligion,
      "Budget": newBudget,
      "Personality": newPersonality,
    }, {params: {_id: cur_id}})
  }

}
