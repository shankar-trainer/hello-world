import { Component } from '@angular/core';
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-twoway',
  imports: [CommonModule,FormsModule],
  templateUrl: './twoway.component.html',
  styleUrl: './twoway.component.css'
})
export class TwowayComponent {
    text: string = 'Hello, Angular!';

    onInputChange(event:any){
       this.text=event.target.value;
    }
}
