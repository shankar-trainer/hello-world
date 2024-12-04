import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RestapiService } from '../restapi-service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  users: any;
  employees:any=[{
    "id":'',
    "name":'',
    "salary":0
  }];
  constructor(private service: RestapiService) { }


  ngOnInit() {
  }

  getUsers() {
    let resp = this.service.getUsers();
    resp.subscribe(data => {
      this.users = data
      console.log(JSON.stringify(data))
    });
  }
  getEmployees() {
    let resp = this.service.getEmployees();
    resp.subscribe(data => {
      this.employees = data
      console.log(JSON.stringify(data))
    });
  }

}
