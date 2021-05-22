import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChangecaseComponent } from './changecase.component';

describe('ChangecaseComponent', () => {
  let component: ChangecaseComponent;
  let fixture: ComponentFixture<ChangecaseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChangecaseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChangecaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
