import { Component, Input } from '@angular/core';
import { Calculation } from './model/Calculation';

@Component({
  selector: 'app-interest-calculation',
  templateUrl: './interest-calculation.component.html',
  styleUrls: ['./interest-calculation.component.css']
})
export class InterestCalculationComponent {
@Input()  calc:Calculation;

constructor(){
 this.calc=new Calculation();
}
ngInit(){
  
}
}
