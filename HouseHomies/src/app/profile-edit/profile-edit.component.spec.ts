import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ProfileEditComponent } from './profile-edit.component';
import { RouterTestingModule } from '@angular/router/testing';
import {By} from '@angular/platform-browser';
import { Router, RouterLink } from '@angular/router';

describe('ProfileEditComponent', () => {
  let component: ProfileEditComponent;
  let fixture: ComponentFixture<ProfileEditComponent>;
  let router: Router;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, RouterTestingModule],
      declarations: [ ProfileEditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfileEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('existing data should appear in all the valid boxes', () => {
    expect(component).toBeTruthy();
    component.firstName = "Hi";
    component.lastName = "Checking";
    fixture.detectChanges();
    const app = fixture.debugElement.componentInstance;
    expect(app.firstName).toEqual("Hi");
    expect(app.lastName).toEqual("Checking");
  })

  it('should navigate back to the profile page', () => {
    const component = fixture.componentInstance;
    let router = TestBed.get(Router);
    const trackSpy = spyOn(router, 'navigate');
    component.handleClick();
    fixture.detectChanges();
    expect(trackSpy).toHaveBeenCalledWith(['/user-profile']);
  })
});
