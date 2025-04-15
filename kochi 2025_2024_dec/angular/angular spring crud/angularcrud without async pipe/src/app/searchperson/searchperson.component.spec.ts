import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchpersonComponent } from './searchperson.component';

describe('SearchpersonComponent', () => {
  let component: SearchpersonComponent;
  let fixture: ComponentFixture<SearchpersonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SearchpersonComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchpersonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
