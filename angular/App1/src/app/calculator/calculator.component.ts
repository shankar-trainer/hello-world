import { Component } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
  n1:number;
  n2:number;
  n3:number;

  constructor(){
    this.n1=100;
    this.n2=100;
    this.n3=this.n1+this.n2;
  }
}
