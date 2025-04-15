import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-pipeexample',
  templateUrl: './pipeexample.component.html',
  styleUrls: ['./pipeexample.component.css']
})
export class PipeexampleComponent {
  @Input() n1: number;
  @Input() n2: number;
  constructor() {
    this.n1 = 0;
    this.n2 = 0;
  }
}
