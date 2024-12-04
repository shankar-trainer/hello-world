import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetallcustomerComponent } from './getallcustomer.component';

describe('GetallcustomerComponent', () => {
  let component: GetallcustomerComponent;
  let fixture: ComponentFixture<GetallcustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GetallcustomerComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GetallcustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
