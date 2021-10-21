import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MyappointmentComponent } from './myappointment.component';

describe('MyappointmentComponent', () => {
  let component: MyappointmentComponent;
  let fixture: ComponentFixture<MyappointmentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MyappointmentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MyappointmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
