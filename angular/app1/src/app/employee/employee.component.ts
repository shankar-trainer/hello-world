import { Component } from '@angular/core';
import { Employee } from './employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
 employee:Employee[];
 img1:string="https://hips.hearstapps.com/hmg-prod/images/close-up-of-tulips-blooming-in-field-royalty-free-image-1584131603.jpg"; 
 img_width:number=200;
 img_height:number=150;

 img2:string="./assets/img2.jpg";
 img3:string="./assets/img3.jpg";

 constructor(){
  this.employee=[
          {"id":100001,"name":"suraj kumar","salary":200000},
          {"id":100002,"name":"aman kumar","salary":240000},
          {"id":100003,"name":"priyanshu kumar","salary":120000},
          {"id":100004,"name":"rahul kumar","salary":280000},
          {"id":100005,"name":"balram kumar","salary":290000},
          {"id":100006,"name":"puneet kumar","salary":10000},
          {"id":100007,"name":"parmod kumar","salary":80000},
          {"id":100008,"name":"mohan kumar","salary":75000},
          {"id":100009,"name":"anand kumar","salary":40000},
          {"id":1000010,"name":"piyush kumar","salary":55000}
  ]
 }
}
