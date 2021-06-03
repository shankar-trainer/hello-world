import { Component, OnInit, Input } from '@angular/core';
import { User } from './user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

 @Input() user:User;
  
  constructor() { 
    this.user=new User();
  }

  userInfo(){
    alert('id  '+this.user.userId)
    alert('name   '+this.user.userName)
    alert('salary   '+this.user.userSalary)
  }

  ngOnInit(): void {
  }

}
