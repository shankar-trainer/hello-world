import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Searchproduct2Component } from './searchproduct2.component';

describe('Searchproduct2Component', () => {
  let component: Searchproduct2Component;
  let fixture: ComponentFixture<Searchproduct2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Searchproduct2Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Searchproduct2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
