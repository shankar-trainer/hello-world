import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  @Input() roll:number;
  @Input() name:string;
  @Input() marks:number;
  @Input() grade:string;

  constructor() { 
    this.roll=0;
    this.name='';
    this.marks=0;
    this.grade='';
  }

  ngOnInit(): void {
  }

}
