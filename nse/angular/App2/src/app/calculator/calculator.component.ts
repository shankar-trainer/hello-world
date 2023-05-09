import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
 @Input() n1:number;
 @Input() n2:number;
 @Input() operation:string;
 @Input() n3:number;
 @Input() n4:number;
 
 constructor(){
  this.n1=0;
  this.n2=0;
  this.operation='';

  this.n3=0;
  this.n4=0;

 }
}
