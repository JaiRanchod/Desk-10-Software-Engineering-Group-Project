import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { NgbDate, NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { SectionsComponent } from './sections.component';

describe('SectionsComponent', () => {
  let component: SectionsComponent;
  let fixture: ComponentFixture<SectionsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports:[NgbModule],
      declarations: [ SectionsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SectionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
