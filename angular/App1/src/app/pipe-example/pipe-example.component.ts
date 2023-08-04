import { Component } from '@angular/core';

@Component({
  selector: 'app-pipe-example',
  templateUrl: './pipe-example.component.html',
  styleUrls: ['./pipe-example.component.css']
})
export class PipeExampleComponent {
   n1:number;
   n2:number;
   n3:number;
   constructor(){
    this.n1=100;
    this.n2=3;
    this.n3=2;
   }
}
