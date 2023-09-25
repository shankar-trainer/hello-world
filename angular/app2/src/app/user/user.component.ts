import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  @Input() id:number;
  @Input() name:string;
  @Input() salary:number;
  @Input() location:string;
  @Input() state:string;

  submitted:boolean;

   constructor(){
    this.submitted=false;
    this.id=66556;
    this.name='suresh kumar'
    this.salary=45000;
    this.location='new delhi';
    this.state='delhi';
   }

   userInfo(){
    this.submitted=true
   }


}
