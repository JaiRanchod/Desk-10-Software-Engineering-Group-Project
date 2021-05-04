import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { LoginComponent } from './login.component';
import { RouterTestingModule } from '@angular/router/testing';
import {FormsModule} from '@angular/forms';
import { Router, RouterLink } from '@angular/router';

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, RouterTestingModule, FormsModule],
      declarations: [ LoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  /*it('should display an invalid account details message', () => {
    const component = fixture.componentInstance;
    const app = fixture.debugElement.componentInstance;
    component.handleClick();
    fixture.detectChanges();
    console.log("CHECKING  "+component.successStatus);
    expect(component.successStatus).toEqual("Incorrect Details Entered");
  })*/

  /*it('should navigate back to the profile page', () => {
    const component = fixture.componentInstance;
    component.handleClick();
    fixture.detectChanges();
    expect(component.successStatus).toEqual("Incorrect Details Entered");
  })*/
});
