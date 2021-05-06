import { Component, OnInit, AfterViewInit } from '@angular/core';
import { DataService } from '../services/data.service';
import { ApiService } from '../services/api.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-profile-edit',
  templateUrl: './profile-edit.component.html',
  styleUrls: ['./profile-edit.component.scss']
})
export class ProfileEditComponent implements OnInit, AfterViewInit {
    public firstName: string;
    public preferredName: String;
    public location: String;
    public gender: String;
    public age: Number;
    public lastName: string;
    public phoneNumber: String;
    public bio: String;
    public uniCourse: String;
    public fullName: String;
    public religion: String;
    public image: String;
    public personality: String;
    public budget: number;
    public _id: string;
    stats: any = [];

  constructor(private dataService: DataService, private api: ApiService, private router: Router) { }
  ngAfterViewInit(): void {  
    }

  ngOnInit(): void {
    this.retrieveData();
  }

  retrieveData() {
    this.dataService.getAll().subscribe(
        data => {
          console.log(data);
          this.stats = data;
          this._id = this.stats[0]._id;
          // now let's update the fields
          this.firstName = this.stats[0]["First Name"];
          this.image = this.stats[0].Image;
          console.log("Hi " + this.firstName);
          this.lastName = this.stats[0].Surname;
          this.location = this.stats[0].Location;
          this.fullName = this.firstName + " " + this.lastName;
          this.preferredName = this.stats[0]["Preferred Name"];
          this.gender = this.stats[0].Gender;
          this.religion = this.stats[0].Religion;
          this.age = this.stats[0].Age;
          this.phoneNumber = this.stats[0]["Phone Number"];
          this.uniCourse = this.stats[0]["University Course"];
          this.bio = this.stats[0].Bio;
          this.personality = this.stats[0].Personality;
          this.budget = this.stats[0].Budget;
        },
        error => {
          console.log(error);
        });
    }

    handleClick(){
      let newPreferredName = (document.getElementById('preferredName') as HTMLInputElement).value;
      console.log(newPreferredName);
      let newLocation = (document.getElementById('location') as HTMLInputElement).value;
      console.log(newLocation);
      let newGender = (document.getElementById('gender') as HTMLInputElement).value;
      console.log(newGender);
      let newAge = (document.getElementById('age') as HTMLInputElement).value;
      console.log(newAge);
      let newPhoneNumber = (document.getElementById('phoneNumber') as HTMLInputElement).value;
      console.log(newPhoneNumber);
      let newUniCourse = (document.getElementById('uniCourse') as HTMLInputElement).value;
      console.log(newUniCourse);
      let newBio = (document.getElementById('bio') as HTMLInputElement).value;
      console.log(newBio); 
      let newFirstName = (document.getElementById('firstName') as HTMLInputElement).value;
      console.log(newFirstName);
      let newLastName = (document.getElementById('lastName') as HTMLInputElement).value;
      console.log(newLastName);
      let newReligion = (document.getElementById('religion') as HTMLInputElement).value;
      console.log(newReligion);
      let newBudget = (document.getElementById('budget') as HTMLInputElement).value;
      console.log(newBudget);
      let newPersonality = (document.getElementById('personality') as HTMLInputElement).value;
      console.log(newPersonality);
      this.api.post_update(this._id, newPreferredName, newLocation, newGender, newAge, newPhoneNumber, newUniCourse, newBio, newFirstName, newLastName, newReligion, newBudget, newPersonality).subscribe((res) =>{
        console.log(res);
      });
      this.router.navigate(['/user-profile']);
    }

}