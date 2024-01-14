import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomeraddComponent } from './customeradd.component';

describe('CustomeraddComponent', () => {
  let component: CustomeraddComponent;
  let fixture: ComponentFixture<CustomeraddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CustomeraddComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CustomeraddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
