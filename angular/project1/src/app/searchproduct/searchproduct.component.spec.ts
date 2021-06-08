import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchproductComponent } from './searchproduct.component';

describe('SearchproductComponent', () => {
  let component: SearchproductComponent;
  let fixture: ComponentFixture<SearchproductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchproductComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
