import { Component } from '@angular/core';
import {CommonModule} from "@angular/common";

@Component({
  selector: 'app-child',
  imports: [CommonModule],
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
    counter: number = 0;

    incrementCounter() {
        this.counter++;
    }

    resetCounter() {
        this.counter = 0;
    }
}
