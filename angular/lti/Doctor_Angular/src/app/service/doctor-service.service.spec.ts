import { TestBed } from '@angular/core/testing';

import { DoctorServiceService } from './doctor-service.service';

describe('DoctorServiceService', () => {
  let service: DoctorServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DoctorServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
