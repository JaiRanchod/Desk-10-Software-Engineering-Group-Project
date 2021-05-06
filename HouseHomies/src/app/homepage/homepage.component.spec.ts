import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { HomepageComponent } from './homepage.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ProfileComponent } from '../profile/profile.component';

describe('HomepageComponent', () => {
  let component: HomepageComponent;
  let fixture: ComponentFixture<HomepageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, BrowserAnimationsModule],
      declarations: [ HomepageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HomepageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should display a card', () => {
    expect(component).toBeTruthy();
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
    component.cur_card = {
      _id: 'profile id',
      "Age": 10,
      Image: "https://images.unsplash.com/photo-1617375407361-9815100c4324?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60",
      "Bio": 'profile bio',
      "First Name": 'checking first',
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
    const app = fixture.debugElement.componentInstance;
    expect(component.cur_card['First Name']).toEqual("checking first");
  })
});
