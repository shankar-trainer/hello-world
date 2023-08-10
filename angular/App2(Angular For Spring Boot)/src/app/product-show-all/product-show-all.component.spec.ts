import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductShowAllComponent } from './product-show-all.component';

describe('ProductShowAllComponent', () => {
  let component: ProductShowAllComponent;
  let fixture: ComponentFixture<ProductShowAllComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProductShowAllComponent]
    });
    fixture = TestBed.createComponent(ProductShowAllComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
