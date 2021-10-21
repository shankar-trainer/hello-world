import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MydiagnosticcentreComponent } from './mydiagnosticcentre.component';

describe('MydiagnosticcentreComponent', () => {
  let component: MydiagnosticcentreComponent;
  let fixture: ComponentFixture<MydiagnosticcentreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MydiagnosticcentreComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MydiagnosticcentreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
