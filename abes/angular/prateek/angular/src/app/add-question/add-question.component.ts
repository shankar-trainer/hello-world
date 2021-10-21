import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Exam } from '../exam';
import { ExamService } from '../exam.service';
import { Question } from '../question';

@Component({
  selector: 'app-add-question',
  templateUrl: './add-question.component.html',
  styleUrls: ['./add-question.component.css']
})
export class AddQuestionComponent implements OnInit {
  @ViewChild("frm")
  private frm: NgForm;
  ques: Question;
  msg: string;
  errorMsg: string;
    
  exam:Exam=new Exam();
  exams: Exam[] = [];
  
  status:boolean=false;
  submitted = false;

  constructor(private examService: ExamService) { }
  ngOnInit() {
    this.ques = new Question();
    //this.examService.viewExams().subscribe(data => this.exams = data);
  }

  addQuestion() {
    this.submitted=true;
    console.log("ques is title    is "+this.ques.questionTitle
    );
    this.examService.addQuestion(this.ques).subscribe(data => {
     // this.msg = data.message;

      this.frm.resetForm()
      this.status=true;
    },
      error => {
        this.status=false;
        this.errorMsg = error.error.message;
        //console.log("error is "+error);
        console.log("error msg is "+this.errorMsg);
        console.log("error msg is == "+error.error.message);
        console.log("error msg is... "+JSON.stringify(error.error));
      });
  }
}
