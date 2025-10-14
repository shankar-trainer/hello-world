import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Counterapp2Component } from './counterapp2.component';

describe('Counterapp2Component', () => {
  let component: Counterapp2Component;
  let fixture: ComponentFixture<Counterapp2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Counterapp2Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Counterapp2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
