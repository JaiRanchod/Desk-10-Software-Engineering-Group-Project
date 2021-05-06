import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

//load profile interface
import { Profile } from '../interfaces/Profile';


@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css'],
})
export class CardComponent implements OnInit {

  //This input is recieved from the parent component homepage
  @Input() profile: Profile;

  //Event emitter to be used to emit when the check or x has been clicked
  @Output() results: EventEmitter<boolean>;

  constructor() { 
    //initalize the results event emitter
    this.results = new EventEmitter<boolean>();
  }

  ngOnInit(): void {
  }

  choose_yes(){
    //emit true to the parent component
    this.results.emit(true);
  }


  choose_no(){
    //emit false to the parent component
    this.results.emit(false);
  }

}
