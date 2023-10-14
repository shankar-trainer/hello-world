import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-pipe-program',
  templateUrl: './pipe-program.component.html',
  styleUrls: ['./pipe-program.component.css']
})
export class PipeProgramComponent {

  @Input() base: number = 0;
  @Input() exponent: number = 0;

  

}
