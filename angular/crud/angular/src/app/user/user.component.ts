import { Component, Input } from '@angular/core';
import { User } from './model/user';
import { data } from './data/userdata';
import { CommonModule } from '@angular/common';
import { PowerPipe } from "./pipe/power.pipe";
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [CommonModule, PowerPipe,FormsModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {
  user: User;
  user1: User[];
 @Input() base: number = 0;
 @Input() exponent: number = 0;

 visible:boolean=false;

  constructor() {
    this.user = new User();
    this.user1 = data;
  }

  show(){
    this.visible=true;
  }

}
