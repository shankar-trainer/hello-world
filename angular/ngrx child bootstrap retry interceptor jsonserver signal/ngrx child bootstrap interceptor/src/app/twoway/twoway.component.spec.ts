import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwowayComponent } from './twoway.component';

describe('TwowayComponent', () => {
  let component: TwowayComponent;
  let fixture: ComponentFixture<TwowayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TwowayComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TwowayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

});
