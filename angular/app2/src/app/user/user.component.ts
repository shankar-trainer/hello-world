import { Component } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
   id:number;
   name:string;
   salary:number;
   location:string;
   state:string;

   constructor(){
    this.id=66556;
    this.name='suresh kumar'
    this.salary=45000;
    this.location='new delhi';
    this.state='delhi';
   }



}
