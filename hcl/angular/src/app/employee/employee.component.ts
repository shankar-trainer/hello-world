import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  //templateUrl: './employee.component.html',
  template:`
  <h1>Employee Component</h1>
  Author is {{author}}<br>
  Post Date is {{posted_date}}<br>
  Category   {{category}}
  `,
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
