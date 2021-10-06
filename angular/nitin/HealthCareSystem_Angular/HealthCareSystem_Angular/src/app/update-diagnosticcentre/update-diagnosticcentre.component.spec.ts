import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateDiagnosticcentreComponent } from './update-diagnosticcentre.component';

describe('UpdateDiagnosticcentreComponent', () => {
  let component: UpdateDiagnosticcentreComponent;
  let fixture: ComponentFixture<UpdateDiagnosticcentreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateDiagnosticcentreComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateDiagnosticcentreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
