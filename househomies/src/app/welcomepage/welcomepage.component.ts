import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-home',
    templateUrl: './welcomepage.component.html',
    styleUrls: ['./welcomepage.component.css']
})

export class WelcomepageComponent implements OnInit {
    model = {
        left: true,
        middle: false,
        right: false
    };

    focus;
    focus1;
    constructor() { }

    ngOnInit() {}
}
