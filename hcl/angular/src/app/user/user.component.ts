import { Component } from '@angular/core';
import { User } from './model/user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
 img1:string="https://cdn.pixabay.com/photo/2015/04/19/08/32/marguerite-729510__340.jpg";
 img2:string="assets/employee.jpg";
 
 img1width:number=300;
 img1height:number=250;

 img2width:number=200;
 img2height:number=150;

  user: User;
  user1: User[];

  constructor() {
    this.user = new User(100001, 'kalam partap', 25000, ['flowering', 'dancing', 'music']);

    this.user1 = [
      {
        id: 1009, name: 'mohan kumar', salary: 20000, hobbies: ['flowering', 'dancing', 'music']
      },

      {
        id: 1010, name: 'suman kumar', salary: 25000, hobbies: ['flowering', 'dancing', 'music']
      },

      {
        id: 1011, name: 'rahul kumar', salary: 28000, hobbies: ['flowering', 'dancing', 'music']
      },

      {
        id: 1012, name: 'amit kumar', salary: 70000, hobbies: ['flowering', 'dancing', 'music']
      }
    ]
  }
  userInfo(){
    alert('User data id'+this.user.id+"\nname "+this.user.name)
  }

}
