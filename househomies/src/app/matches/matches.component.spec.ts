import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { MatchingComponent } from './matches.component';
import { Router } from '@angular/router';
import { RouterTestingModule } from '@angular/router/testing';
import { DebugElement } from '@angular/core';

describe('MatchingComponent', () => {
  let component: MatchingComponent;
  let fixture: ComponentFixture<MatchingComponent>;
  let router: Router;
  let html = DebugElement;

  beforeEach(async() => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, RouterTestingModule],
      declarations: [ MatchingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MatchingComponent);
    component = fixture.componentInstance;
    router = TestBed.get(Router);
    component.user_profile = {
      _id: 'profile id',
      "Age": 10,
      Image: "https://images.unsplash.com/photo-1617375407361-9815100c4324?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60",
      "Bio": 'profile bio',
      "First Name": 'profile first',
      "Gender": 'profile gender',
      "Location": 'profile location',
      "Phone Number": 'profile phone no',
      "Preferred Name": 'profile preferred',
      "Religion": 'profile religion',
      "Surname": 'profile surname',
      "University Course": 'profile university',
      "like": [],
      "dislike": [],
      "Budget": 'profile budget',
      "Personality": 'profile personality',
    };
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
