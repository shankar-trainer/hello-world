import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListOfDiagnosticCentersComponent } from './list-of-diagnostic-centers.component';

describe('ListOfDiagnosticCentersComponent', () => {
  let component: ListOfDiagnosticCentersComponent;
  let fixture: ComponentFixture<ListOfDiagnosticCentersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListOfDiagnosticCentersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListOfDiagnosticCentersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
