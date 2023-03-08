import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-interest-calculation',
  templateUrl: './interest-calculation.component.html',
  styleUrls: ['./interest-calculation.component.css']
})
export class InterestCalculationComponent {

 @Input() amount:number;
 @Input()  rate:number;
 @Input()  time:number;

  constructor(){
     this.amount=0;
     this.time=0;
     this.rate=0;
  }


}
