import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculator',
  imports: [CommonModule, FormsModule],
  templateUrl: './calculator.html',
  styleUrl: './calculator.css',
})
export class Calculator {
  @Input() n1: number = 0;
  @Input() n2: number = 0;
  @Input() n3: number = 0;

  addition() {
    this.n3 = this.n1 + this.n2;
  }
  subtraction() {
    this.n3 = this.n1 - this.n2;
  }
  mutiplication() {
    this.n3 = this.n1 * this.n2;
  }
  division() {
    this.n3 = this.n1 / this.n2;
  }


  hello() {
    alert("hello called ");
  }


}
