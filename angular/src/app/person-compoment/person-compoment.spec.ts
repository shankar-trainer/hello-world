import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonCompoment } from './person-compoment';

describe('PersonCompoment', () => {
  let component: PersonCompoment;
  let fixture: ComponentFixture<PersonCompoment>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PersonCompoment],
    }).compileComponents();

    fixture = TestBed.createComponent(PersonCompoment);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
