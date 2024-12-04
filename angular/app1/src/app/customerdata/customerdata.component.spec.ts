import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerdataComponent } from './customerdata.component';

describe('CustomerdataComponent', () => {
  let component: CustomerdataComponent;
  let fixture: ComponentFixture<CustomerdataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CustomerdataComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomerdataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
