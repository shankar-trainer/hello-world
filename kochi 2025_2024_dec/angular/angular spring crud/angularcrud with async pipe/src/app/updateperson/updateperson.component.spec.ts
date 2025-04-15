import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatepersonComponent } from './updateperson.component';

describe('UpdatepersonComponent', () => {
  let component: UpdatepersonComponent;
  let fixture: ComponentFixture<UpdatepersonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UpdatepersonComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdatepersonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
