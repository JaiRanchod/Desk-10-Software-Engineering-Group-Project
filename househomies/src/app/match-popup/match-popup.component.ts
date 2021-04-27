import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Profile } from '../interfaces/Profile';

@Component({
  selector: 'app-match-popup',
  templateUrl: './match-popup.component.html',
  styleUrls: ['./match-popup.component.css'],
  host: {'class': 'position-fixed h-100 w-100'}

})
export class MatchPopupComponent implements OnInit {
  @Input() matched_profile: Profile;
  @Output() exit: EventEmitter<boolean>;

  constructor() { 
    this.exit = new EventEmitter<boolean>();
  }

  ngOnInit(): void {
  }

  click_exit(){
    this.exit.emit(true)
  }

}
