import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddpersonComponent } from './addperson.component';

describe('AddpersonComponent', () => {
  let component: AddpersonComponent;
  let fixture: ComponentFixture<AddpersonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddpersonComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddpersonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
