import { Component, Input } from '@angular/core';
import { employee } from './model/employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
  @Input() emp: employee;
  submitted: boolean = false;
  constructor() {
    this.emp = new employee();
  }
  submit() {
    this.submitted = true;
  }
}
