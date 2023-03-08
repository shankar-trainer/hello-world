import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MathProgramComponent } from './math-program.component';

describe('MathProgramComponent', () => {
  let component: MathProgramComponent;
  let fixture: ComponentFixture<MathProgramComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MathProgramComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MathProgramComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
