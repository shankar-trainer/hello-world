import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletepersonComponent } from './deleteperson.component';

describe('DeletepersonComponent', () => {
  let component: DeletepersonComponent;
  let fixture: ComponentFixture<DeletepersonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DeletepersonComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeletepersonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
