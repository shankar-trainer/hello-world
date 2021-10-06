import { TestBed } from '@angular/core/testing';

import { MyproductService } from './myproduct.service';

describe('MyproductService', () => {
  let service: MyproductService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MyproductService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
