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
    this.n2=50;
    this.n3=0;
  }

  sum(){
     this.n3=this.n1+this.n2;
     alert(`addition of ${this.n1} and ${this.n2} is ${this.n1+this.n2}`)
  }

}
