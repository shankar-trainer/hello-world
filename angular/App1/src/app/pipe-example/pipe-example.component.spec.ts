import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PipeExampleComponent } from './pipe-example.component';

describe('PipeExampleComponent', () => {
  let component: PipeExampleComponent;
  let fixture: ComponentFixture<PipeExampleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PipeExampleComponent]
    });
    fixture = TestBed.createComponent(PipeExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
