import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  imports: [],
  templateUrl: './employee.html',
  styleUrl: './employee.css',
})
export class Employee {

  id:number;
  name:string;
  age:number;
  dob:Date;

  constructor(){
    this.id=1898989;
    this.name="dr aryan sahu";
    this.age=22;
    this.dob=new Date('2002-10-22');
  }

}
