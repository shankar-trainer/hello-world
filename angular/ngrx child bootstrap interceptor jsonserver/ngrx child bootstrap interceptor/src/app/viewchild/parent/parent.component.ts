import {Component, ViewChild} from '@angular/core';
import {CommonModule} from "@angular/common";
import {ChildComponent} from "../child/child.component";

@Component({
  selector: 'app-parent',
  imports: [CommonModule,ChildComponent],
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent {

    @ViewChild(ChildComponent) childComponent!: ChildComponent;

    ngAfterViewInit() {
        // childComponent is available here
        console.log('Child counter initially:', this.childComponent.counter);
    }

    resetChildCounter() {
        this.childComponent.resetCounter();
    }

}
