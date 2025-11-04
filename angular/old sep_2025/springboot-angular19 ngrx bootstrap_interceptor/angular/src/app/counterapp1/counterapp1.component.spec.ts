import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Counterapp1Component } from './counterapp1.component';

describe('Counterapp1Component', () => {
  let component: Counterapp1Component;
  let fixture: ComponentFixture<Counterapp1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Counterapp1Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Counterapp1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
