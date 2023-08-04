import { Component } from '@angular/core';
import { UserData } from './data/user.data';
import { User } from './model/user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {

  user1:User[];

  constructor(){
    this.user1=UserData;
  }

}
