import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Login1 } from './login1';

describe('Login1', () => {
  let component: Login1;
  let fixture: ComponentFixture<Login1>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Login1]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Login1);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
