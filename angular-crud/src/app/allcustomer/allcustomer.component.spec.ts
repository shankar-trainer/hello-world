import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllcustomerComponent } from './allcustomer.component';

describe('AllcustomerComponent', () => {
  let component: AllcustomerComponent;
  let fixture: ComponentFixture<AllcustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AllcustomerComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllcustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
