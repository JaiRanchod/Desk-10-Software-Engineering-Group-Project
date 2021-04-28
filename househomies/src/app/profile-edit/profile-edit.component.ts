import { Component, OnInit, AfterViewInit } from '@angular/core';
import noUiSlider from "nouislider";
import { DataService } from '../services/data.service';


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
    stats: any = [];

  constructor(private dataService: DataService) { }
  ngAfterViewInit(): void {
    var slider = document.getElementById("test");

      noUiSlider.create(slider, {
        start: 40,
        connect: [true, false],
        range: {
          min: 0,
          max: 100
        }
      });
    }

  ngOnInit(): void {
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
        },
        error => {
          console.log(error);
        });
    }

}