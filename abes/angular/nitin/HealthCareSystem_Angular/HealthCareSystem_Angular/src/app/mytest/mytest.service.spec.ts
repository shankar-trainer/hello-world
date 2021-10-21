import { TestBed } from '@angular/core/testing';

import { MytestService } from './mytest.service';

describe('MytestService', () => {
  let service: MytestService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MytestService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
