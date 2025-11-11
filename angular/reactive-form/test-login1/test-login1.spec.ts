import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestLogin1 } from './test-login1';

describe('TestLogin1', () => {
  let component: TestLogin1;
  let fixture: ComponentFixture<TestLogin1>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TestLogin1]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TestLogin1);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
