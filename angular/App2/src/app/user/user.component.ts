import { Component } from '@angular/core';
import { User } from './user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})

export class UserComponent {
  user: User[];
  constructor() {
    this.user = [
      { userId: 10001, userName: 'raman kumar', userSalary: 20000.0 },
      { userId: 10002, userName: 'shyam kumar', userSalary: 10000.0 },
      { userId: 10003, userName: 'suresh kumar', userSalary: 30000.0 },
      { userId: 10004, userName: 'radhe kumar', userSalary: 40000.0 },
      { userId: 10005, userName: 'vimal kumar', userSalary: 50000.0 }
    ]
  };


}
