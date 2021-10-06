import { Component, OnInit } from '@angular/core';
import { ExamService } from '../exam.service';
import { Exam } from '../exam';
import { Question } from '../question';

@Component({
  selector: 'app-viewquestion',
  templateUrl: './view-question.component.html',
  styleUrls: ['./view-question.component.css']
})
export class ViewQuestionComponent implements OnInit {
  msg:string;
  errorMsg:string;
  //exam:Exam = new Exam();
  exams:Exam[]=[];
  addQuestionFlag:boolean;
  viewQuestionFlag:Boolean;
  questions:Question[];
  

  constructor(private examService:ExamService ) { }
  ngOnInit(): void {
    
      this.examService.viewQuestions().subscribe(data=>{this.questions=data; this.addQuestionFlag =false;
      this.viewQuestionFlag=true;});
  }

}