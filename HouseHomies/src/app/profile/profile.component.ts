import { Component, OnInit } from '@angular/core';
import { DataService } from '../services/data.service';

@Component({
    selector: 'app-profile',
    templateUrl: './profile.component.html',
    styleUrls: ['./profile.component.scss']
})

export class ProfileComponent implements OnInit {

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
    stats: any = [];


    constructor(private dataService: DataService) { }

    ngOnInit() {
        this.retrieveData();
    }

    retrieveData() {
        this.dataService.getAll().subscribe(
            data => {
              console.log(data);
              this.stats = data;
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
              this.phoneNumber = "+" + this.stats[0]["Phone Number"];
              this.uniCourse = this.stats[0]["University Course"];
              this.bio = this.stats[0].Bio;
              this.personality = this.stats[0].Personality;
              this.budget = this.stats[0].Budget;
            },
            error => {
              console.log(error);
            });
        }

}
