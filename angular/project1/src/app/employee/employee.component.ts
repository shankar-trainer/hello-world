import { Component, OnInit, HostListener } from '@angular/core';
import  { Employee } from './employee';
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  emp:Employee;
  emp1:Employee[];
  location:string;
  country:string;

//   @HostListener('mousehover')
// onHover(){
//   alert('mouse hover')
// }

  mylocation(){
    alert("location is "+this.location);
  }

  constructor(){
    this.country='india';
    this.location='chennai';
    this.emp={
      "empId":1001,
      "empName":"ram kumar",
      "empSalary":20000,
      "empDob":new Date('11-10-1992')
    }

    this.emp1=[
    {
      "empId":9001,
      "empName":"rameswar kumar",
      "empSalary":20000,
      "empDob":new Date('10-10-1993')
    },
    {
      "empId":9002,
      "empName":"parmeswar kumar",
      "empSalary":30000,
      "empDob":new Date('1-10-1991')
    },
    {
      "empId":9003,
      "empName":"kamles kumar",
      "empSalary":40000,
      "empDob":new Date('12-12-1995')
    },
    {
      "empId":9004,
      "empName":"baleswar kumar",
      "empSalary":22000,
      "empDob":new Date('02-10-1999')
    },
    {
      "empId":1005,
      "empName":"jitendra kumar",
      "empSalary":32000,
      "empDob":new Date('11-01-1999')
    },
    ]
  }

  ngOnInit(): void {
  }

}
