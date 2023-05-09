import { Component, OnInit } from '@angular/core';
import { Survey } from './survey';

@Component({
  selector: 'app-survey',
  templateUrl: './survey.component.html',
  styleUrls: ['./survey.component.css']
})
export class SurveyComponent implements OnInit {
    survey:Survey;
  constructor() { 
      this.survey=new Survey(0,'',new Date(),'');
  }

  ngOnInit(): void {
  }

  onSubmit(){

  }

}
