import { Component, Input } from '@angular/core';
import { Student } from './student';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {
@Input()  student:Student;

  constructor(){
    this.student=new Student();
  }

}
