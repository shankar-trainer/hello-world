import {Component, ViewChild} from '@angular/core';
import {ChildComponent} from '../child/child.component';

@Component({
  selector: 'app-parent',
  imports: [
    ChildComponent
  ],
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})

export class ParentComponent {
@ViewChild(ChildComponent) childComponent: ChildComponent;

constructor() {
   this.childComponent = new ChildComponent();
}
  changeChild(){
    alert("Hello World!");
    this.childComponent.id=989988;
    this.childComponent.name= "vijay kumar";

  }

}
