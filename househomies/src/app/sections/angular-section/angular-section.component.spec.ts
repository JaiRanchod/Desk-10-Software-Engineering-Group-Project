import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { NgbDate, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AngularSectionComponent } from './angular-section.component';

describe('AngularSectionComponent', () => {
  let component: AngularSectionComponent;
  let fixture: ComponentFixture<AngularSectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports:[NgbModule],
      declarations: [ AngularSectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
