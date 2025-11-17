import {Component, ElementRef, ViewChild} from '@angular/core';
import {CommonModule} from "@angular/common";

@Component({
  selector: 'app-parent',
  imports: [CommonModule],
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent1 {

    @ViewChild('myInput') myInputRef!: ElementRef;

    ngAfterViewInit() {
        // Access the native DOM element and its properties
        console.log('Input element:', this.myInputRef.nativeElement);
    }

    focusInput() {
        this.myInputRef.nativeElement.focus(); // Focus the input element
        this.myInputRef.nativeElement.value = 'Focused!'; // Set its value
    }
}
