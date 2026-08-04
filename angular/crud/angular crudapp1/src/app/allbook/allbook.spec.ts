import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Allbook } from './allbook';

describe('Allbook', () => {
  let component: Allbook;
  let fixture: ComponentFixture<Allbook>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Allbook]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Allbook);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
