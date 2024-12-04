import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Customerdata1Component } from './customerdata1.component';

describe('Customerdata1Component', () => {
  let component: Customerdata1Component;
  let fixture: ComponentFixture<Customerdata1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Customerdata1Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Customerdata1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
