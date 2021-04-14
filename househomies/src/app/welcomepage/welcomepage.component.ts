import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-home',
    templateUrl: './welcomepage.component.html',
    styleUrls: ['./welcomepage.component.scss']
})

export class HomeComponent implements OnInit {
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
