import { Component, Input } from '@angular/core';
import { Employee } from './model/employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
submitted:boolean;
@Input()  emp1:Employee;
  constructor(){
    this.emp1=new Employee();
    this.submitted=false;
  }

  getData(){
   this.submitted=true;
  }


}
