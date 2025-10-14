import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShoppingKart1Component } from './shopping-kart1.component';

describe('ShoppingKart1Component', () => {
  let component: ShoppingKart1Component;
  let fixture: ComponentFixture<ShoppingKart1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ShoppingKart1Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShoppingKart1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
