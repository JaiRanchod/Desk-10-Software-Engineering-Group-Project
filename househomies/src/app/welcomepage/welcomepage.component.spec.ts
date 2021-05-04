import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { Router } from '@angular/router';

import { WelcomepageComponent } from './welcomepage.component';

describe('WelcomepageComponent', () => {
  let component: WelcomepageComponent;
  let fixture: ComponentFixture<WelcomepageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WelcomepageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WelcomepageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });

  /*it('should navigate to login', () => {
    const component = fixture.componentInstance;
    let router = TestBed.get(Router);
    const trackSpy = spyOn(router, 'navigate');
    fixture.detectChanges();
    expect(trackSpy).toHaveBeenCalledWith(['/login']);
  })*/

  /*it('should navigate to register', () => {
    const component = fixture.componentInstance;
    let router = TestBed.get(Router);
    const trackSpy = spyOn(router, 'navigate');
    fixture.detectChanges();
    expect(trackSpy).toHaveBeenCalledWith(['/register']);
  })*/
});
