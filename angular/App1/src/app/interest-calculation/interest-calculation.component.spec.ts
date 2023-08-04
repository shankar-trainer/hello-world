import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InterestCalculationComponent } from './interest-calculation.component';

describe('InterestCalculationComponent', () => {
  let component: InterestCalculationComponent;
  let fixture: ComponentFixture<InterestCalculationComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [InterestCalculationComponent]
    });
    fixture = TestBed.createComponent(InterestCalculationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
