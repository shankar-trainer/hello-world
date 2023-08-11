import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentToChildInputComponent } from './parent-to-child-input.component';

describe('ParentToChildInputComponent', () => {
  let component: ParentToChildInputComponent;
  let fixture: ComponentFixture<ParentToChildInputComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ParentToChildInputComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ParentToChildInputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
