import { Component } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {
  roll:number;
  name:string;
  subject:string;
  dob:Date;

  constructor(){
    this.roll=10001;
    this.name='anil kumar';
    this.subject='math';
    this.dob=new Date('2000-11-12');
  }
}
