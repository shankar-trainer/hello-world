import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PipeProgramComponent } from './pipe-program.component';

describe('PipeProgramComponent', () => {
  let component: PipeProgramComponent;
  let fixture: ComponentFixture<PipeProgramComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PipeProgramComponent]
    });
    fixture = TestBed.createComponent(PipeProgramComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
