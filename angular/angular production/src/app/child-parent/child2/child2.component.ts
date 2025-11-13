import {Component, EventEmitter, Output} from '@angular/core';
import {CommonModule} from "@angular/common";

@Component({
  selector: 'app-child2',
  imports: [CommonModule],
  templateUrl: './child2.component.html',
  styleUrl: './child2.component.css'
})
export class Child2Component {
    @Output() messageEvent = new EventEmitter<string>();

    sendMessage() {
        // Emit a custom event with a string payload
        this.messageEvent.emit('Hello from the Child Component!');
    }

}
