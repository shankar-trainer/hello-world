import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculator',
  imports: [CommonModule,FormsModule],
  templateUrl: './calculator.component.html',
  styleUrl: './calculator.component.css'
})
export class CalculatorComponent {
 @Input() n1:number=0;
 @Input() n2:number=0;
 @Input() counter:number=0;

 date1:string=new Date().toLocaleDateString();
 time=new Date();
 
 interval=setInterval(() => {
  this.time=new Date();
}, 1000);
 
increment(){
  this.counter++;
 }
 
 decrement(){
  this.counter--;
 }
 
 addition(){
  alert('addition is '+(this.n1+this.n2))
 }
 subtraction(){
  alert('subtraction is '+(this.n1-this.n2))
 }
  multiplication(){
  alert('multiplication is '+(this.n1*this.n2))
 }
 division(){
  alert('division is '+(this.n1/this.n2))
 }
}
