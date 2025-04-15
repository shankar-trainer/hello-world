import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowallpersonComponent } from './showallperson.component';

describe('ShowallpersonComponent', () => {
  let component: ShowallpersonComponent;
  let fixture: ComponentFixture<ShowallpersonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ShowallpersonComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowallpersonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
