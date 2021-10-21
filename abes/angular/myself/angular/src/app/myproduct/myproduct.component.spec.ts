import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MyproductComponent } from './myproduct.component';

describe('MyproductComponent', () => {
  let component: MyproductComponent;
  let fixture: ComponentFixture<MyproductComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MyproductComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MyproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
