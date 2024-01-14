import { Component, Input } from '@angular/core';
import { ExponentPipe } from "./exponent.pipe";
import { FormsModule } from '@angular/forms';

@Component({
    selector: 'app-pipe-example',
    standalone: true,
    templateUrl: './pipe-example.component.html',
    styleUrl: './pipe-example.component.css',
    imports: [ExponentPipe,FormsModule]
})
export class PipeExampleComponent {

 @Input()  n1:number;
 @Input()  n2:number;

   constructor(){
     this.n1=3;
     this.n2=2;
   }

}
