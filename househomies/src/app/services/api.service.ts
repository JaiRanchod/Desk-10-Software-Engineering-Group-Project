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

}
