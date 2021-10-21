import { TestBed } from '@angular/core/testing';

import { MyappointmentService } from './myappointment.service';

describe('MyappointmentService', () => {
  let service: MyappointmentService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MyappointmentService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
