import { Component } from '@angular/core';
import { Student } from './student';
import { studentdata } from './student.data';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {
student:Student[];

constructor(){
  this.student=studentdata;
}

}
