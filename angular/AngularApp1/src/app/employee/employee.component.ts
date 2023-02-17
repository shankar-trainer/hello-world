import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
  author:string;
  posted_date:string;
  category:string;
  likes:number;
  image:string;

  constructor(){
    this.author='jack abraham';
    this.posted_date=new Date().toLocaleDateString()
    this.category='Robotics';
    this.likes=100;
    this.image='assets/employee.jpg';
  }

}
