import { Component, OnInit } from '@angular/core';
import { Student } from '../student/student';
import { StudentService } from '../student/student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  public students:Student[];
  constructor(private _studentService:StudentService) {
    this.students=[];
   }

  ngOnInit(): void {
   this.books;
  }

  public get books(){
    return this._studentService.getBooks().subscribe(studentList =>{
      console.log(studentList)
      this.students=studentList;
    })
  }
}
