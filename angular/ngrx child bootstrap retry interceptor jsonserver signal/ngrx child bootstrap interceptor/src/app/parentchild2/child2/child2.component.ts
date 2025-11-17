import { CommonModule } from '@angular/common';
import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-child2',
  imports: [CommonModule],
  templateUrl: './child2.component.html',
  styleUrl: './child2.component.css'
})
export class Child2Component {
  @Output() buttonClick = new EventEmitter<void>();

  onClick() {
    this.buttonClick.emit();
    console.log("button click emit")
  }


}
