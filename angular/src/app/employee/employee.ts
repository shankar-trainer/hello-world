import { Component } from '@angular/core';
import { Employee1 } from './model/employee'
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-employee',
  imports: [CommonModule],
  templateUrl: './employee.html',
  styleUrl: './employee.css',
})

export class Employee {
  name: string = 'ram kumar';
  age: number;

  emp: Employee1[];

  constructor() {
    this.emp = [
      {
        id: 90001,
        name: 'sures',
        salary: 20000
      },
      {
        id: 90002,
        name: 'umesh',
        salary: 60000
      },
      {
        id: 90003,
        name: 'vimal',
        salary: 78000
      },
      {
        id: 90004,
        name: 'kamal',
        salary: 60000
      },
    ]

    this.age = 30;
  }


}
