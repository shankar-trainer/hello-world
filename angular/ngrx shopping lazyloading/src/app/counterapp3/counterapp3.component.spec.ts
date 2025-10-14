import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Counterapp3Component } from './counterapp3.component';

describe('Counterapp3Component', () => {
  let component: Counterapp3Component;
  let fixture: ComponentFixture<Counterapp3Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Counterapp3Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Counterapp3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
