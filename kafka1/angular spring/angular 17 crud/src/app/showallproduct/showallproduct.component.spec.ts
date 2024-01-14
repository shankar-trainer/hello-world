import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowallproductComponent } from './showallproduct.component';

describe('ShowallproductComponent', () => {
  let component: ShowallproductComponent;
  let fixture: ComponentFixture<ShowallproductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ShowallproductComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ShowallproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
