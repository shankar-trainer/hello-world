import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchcustomerComponent } from './searchcustomer.component';

describe('SearchcustomerComponent', () => {
  let component: SearchcustomerComponent;
  let fixture: ComponentFixture<SearchcustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SearchcustomerComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchcustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
