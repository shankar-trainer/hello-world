import { Component } from '@angular/core';
import {RouterOutlet} from '@angular/router';
import {User} from './user';
import {Book} from './book';

@Component({
  selector: 'app-employee',
  imports: [],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {
  id:number;
  name:string;

  constructor() {
    this.id=10001;
    this.name= 'amit kumar';
  }

  address={
     "id":"7677676",
    "city":"chennai",
    "locattion":"thoraipakkam",
    "state":"tamil nadu"
  }
  //user:User=new User("suman","garg");
  user:User=new User("ram ","kumar");

  book:Book=new Book("java","mr jack");


}
