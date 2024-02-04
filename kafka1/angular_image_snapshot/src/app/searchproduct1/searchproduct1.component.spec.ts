import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchproductComponent1 } from './searchproduct1.component';

describe('Searchproduct1Component', () => {
  let component: SearchproductComponent1;
  let fixture: ComponentFixture<SearchproductComponent1>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SearchproductComponent1]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SearchproductComponent1);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
