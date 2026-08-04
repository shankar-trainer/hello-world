import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplatedrivenComponent } from './templatedriven.component';

describe('TemplatedrivenComponent', () => {
  let component: TemplatedrivenComponent;
  let fixture: ComponentFixture<TemplatedrivenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TemplatedrivenComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TemplatedrivenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
