import { TestBed } from '@angular/core/testing';

import { Personservice } from './personservice';

describe('Personservice', () => {
  let service: Personservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Personservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
