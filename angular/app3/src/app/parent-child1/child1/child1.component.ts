import { Component, Output, EventEmitter } from '@angular/core';
@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component {

  @Output() nameEvent = new EventEmitter<string>();
  @Output() phoneEvent = new EventEmitter<string>();

  userName: string = '';
  userPhone: string = '';

  onNameChange() {
    this.nameEvent.emit(this.userName);
  }

  onPhoneChange() {
    this.phoneEvent.emit(this.userPhone);
  }
}
