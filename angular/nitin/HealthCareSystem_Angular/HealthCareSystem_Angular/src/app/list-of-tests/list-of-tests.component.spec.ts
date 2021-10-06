import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListOfTestsComponent } from './list-of-tests.component';

describe('ListOfTestsComponent', () => {
  let component: ListOfTestsComponent;
  let fixture: ComponentFixture<ListOfTestsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListOfTestsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListOfTestsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
