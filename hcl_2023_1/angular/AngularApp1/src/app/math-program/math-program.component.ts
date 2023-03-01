import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-math-program',
  templateUrl: './math-program.component.html',
  styleUrls: ['./math-program.component.css']
})
export class MathProgramComponent {
@Input() n1:number;
n2:number;
n3:number;

constructor(){
  this.n1=5;
  this.n2=3;
  this.n3=5;
}

}
