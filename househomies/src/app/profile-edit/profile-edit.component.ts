import { Component, OnInit, AfterViewInit } from '@angular/core';
import noUiSlider from "nouislider";


@Component({
  selector: 'app-profile-edit',
  templateUrl: './profile-edit.component.html',
  styleUrls: ['./profile-edit.component.scss']
})
export class ProfileEditComponent implements OnInit, AfterViewInit {

  constructor() { }
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
  }

}