import { TestBed } from '@angular/core/testing';

import { MydiagnosticcentreService } from './mydiagnosticcentre.service';

describe('MydiagnosticcentreService', () => {
  let service: MydiagnosticcentreService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MydiagnosticcentreService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
