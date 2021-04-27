import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-match-card',
  templateUrl: './match-card.component.html',
  styleUrls: ['./match-card.component.css'],
  host: {'class': 'col-lg-4 mb-5'}
})
export class MatchCardComponent implements OnInit {

  //input profile
  @Input() card_profile: any;
  constructor() { }

  ngOnInit(): void {
  }

}
