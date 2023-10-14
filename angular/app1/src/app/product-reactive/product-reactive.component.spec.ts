import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductReactiveComponent } from './product-reactive.component';

describe('ProductReactiveComponent', () => {
  let component: ProductReactiveComponent;
  let fixture: ComponentFixture<ProductReactiveComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProductReactiveComponent]
    });
    fixture = TestBed.createComponent(ProductReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
