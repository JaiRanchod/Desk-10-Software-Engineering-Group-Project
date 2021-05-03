import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { map, filter, switchMap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  private REST_API_SERVER = 'http://localhost:3000/api/UserProfiles';
  private REST_API_SERVER2 = 'http://localhost:3000/api/UserLogins';
  private slash = '/';
  public email = "undefined";

  constructor(private httpClient: HttpClient) { }

  public getAll(){
    console.log("UNDEFINED HERE. IS THIS WORKING? "  + this.REST_API_SERVER);  
    return this.httpClient.get(this.REST_API_SERVER + this.slash + this.email);
  }

  public getAll2(userEmail){
    let tmp = this.REST_API_SERVER2;
    tmp = tmp + "/" + userEmail;
    console.log("GETTING " + tmp);
    return this.httpClient.get(tmp)
  }

  public changeURL(userEmail){
    this.REST_API_SERVER = this.REST_API_SERVER + "/" + userEmail;
    this.REST_API_SERVER2 = this.REST_API_SERVER2 + "/" + userEmail;
  }
}