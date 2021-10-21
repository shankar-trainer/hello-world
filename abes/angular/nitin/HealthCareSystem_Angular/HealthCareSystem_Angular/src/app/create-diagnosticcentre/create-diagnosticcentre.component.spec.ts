import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDiagnosticcentreComponent } from './create-diagnosticcentre.component';

describe('CreateDiagnosticcentreComponent', () => {
  let component: CreateDiagnosticcentreComponent;
  let fixture: ComponentFixture<CreateDiagnosticcentreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateDiagnosticcentreComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateDiagnosticcentreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
