import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PipeexampleComponent } from './pipeexample.component';

describe('PipeexampleComponent', () => {
  let component: PipeexampleComponent;
  let fixture: ComponentFixture<PipeexampleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PipeexampleComponent]
    });
    fixture = TestBed.createComponent(PipeexampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
