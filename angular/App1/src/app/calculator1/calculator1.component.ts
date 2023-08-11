import { Component, Input } from '@angular/core';
import { Calculator } from './calulator';
import { data } from './calculator.data';

@Component({
  selector: 'app-calculator1',
  templateUrl: './calculator1.component.html',
  styleUrls: ['./calculator1.component.css']
})
export class Calculator1Component {

  @Input() calculator: Calculator;
  submitted: boolean = false;
  constructor() {
    this.calculator = data;
  }

  onSubmit() {
    this.submitted = true;
  }
}
