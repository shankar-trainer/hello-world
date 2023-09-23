import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-interest',
  templateUrl: './interest.component.html',
  styleUrls: ['./interest.component.css']
})
export class InterestComponent {
  @Input() amt: number;
  @Input() time: number;
  @Input() rate: number;

  constructor() {
    this.amt = 0;
    this.time = 0;
    this.rate = 0;
  }

  onSubmit(){
    
  }
}
