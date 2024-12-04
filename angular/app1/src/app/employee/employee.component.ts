import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Employee } from './model/employee';

@Component({
  selector: 'app-employee',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {

  id: number;
  name: string;
  age: number;

  emp: Employee;
  emp1: Employee[];

  img_src: string = "assets/img1.jpg";
  img_width: number;
  img_height: number;

  constructor() {
    this.img_width = 200;
    this.img_height = 150;

    this.id = 10001;
    this.name = "amit kumar";
    this.age = 33;
    this.emp = new Employee(1001, 'ram kumar', 20);

    this.emp1 = [
      { id: 9001, name: 'shyam kumar', age: 34 },
      { id: 9002, name: 'amit kumar', age: 36 },
      { id: 9003, name: 'parmod kumar', age: 24 },
      { id: 9004, name: 'sambhu kumar', age: 44 },
      { id: 9005, name: 'anil kumar', age: 16 },
      { id: 9006, name: 'suraj kumar', age: 50 },

    ]
  }
  empdetail(){
    alert('id is '+this.id+"\nname is "+this.name+"\nage is "+this.age);
  }
}



