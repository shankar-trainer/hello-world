import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowallComponent } from './showall.component';

describe('ShowallComponent', () => {
  let component: ShowallComponent;
  let fixture: ComponentFixture<ShowallComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowallComponent]
    });
    fixture = TestBed.createComponent(ShowallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
