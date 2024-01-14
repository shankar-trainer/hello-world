import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { User } from './model/User';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {
  @Input() user:User;
  submitted:boolean=false;

   formSubmit(){
    this.submitted=true;
   }

   constructor(){
    //this.user=new User(10001,'aman kumar',20000);
    this.user=new User(0,'',0);
   }
}
