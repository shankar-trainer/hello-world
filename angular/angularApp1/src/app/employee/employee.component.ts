import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  salary:number;
  lname:string;
  fname:string;
  dob:Date;
  employee:Employee[];

  constructor() {
    this.fname='mohan';
    this.lname='kumar';
    this.salary=676767.77;
    this.dob=new Date('11-10-2020');
    this.employee=[
      {empId:3001,empName:'asish kumar',empSalary:20000,empDob:new Date('10-11-1995')},
      {empId:3002,empName:'suresh kumar',empSalary:24000,empDob:new Date('11-1-1991')},
      {empId:3003,empName:'abhadesh kumar',empSalary:12000,empDob:new Date('11-10-1999')},
      {empId:3004,empName:'sarvesh kumar',empSalary:110000,empDob:new Date('1-10-1998')},
      {empId:3005,empName:'umesh kumar',empSalary:28000,empDob:new Date('2-10-1999')},
      {empId:3006,empName:'ramesh kumar',empSalary:32000,empDob:new Date('12-10-1990')},
    ]
    
   }

  ngOnInit(): void {
  }

}
