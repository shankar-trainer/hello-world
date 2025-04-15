import { Component } from '@angular/core';
import { User } from './user';
import { CommonModule } from '@angular/common';
import { userdata } from './data/user_data';

@Component({
  selector: 'app-user',
  imports: [CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {

  user:User[];
  users:User[];
  constructor(){
    this.user=[
        new User(10001,'sumit kumar',20000),
        new User(10001,'amit kumar',25000),
        new User(10001,'suresh kumar',27000),
        new User(10001,'mahesh kumar',30000),
        new User(10001,'vinod kumar',35000),
        new User(10001,'parmod kumar',10000)
    ],
    this.users=userdata;
  }

}
