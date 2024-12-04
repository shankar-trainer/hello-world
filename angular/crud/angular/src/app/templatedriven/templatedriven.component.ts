import { Component, Input } from '@angular/core';
import { Customer } from './model/customer';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-templatedriven',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './templatedriven.component.html',
  styleUrl: './templatedriven.component.css'
})
export class TemplatedrivenComponent {

  @Input() c: Customer;
  visible:boolean;

  constructor() {
    console.log("constructor called ")
    this.c = new Customer();
    this.visible=true;
  }

  ngOnInit() {
    this.visible=false;
    console.log('ngOnInit called ...');
  }
  ngOnChanges() {
    console.log('ngOnChanges  called ...');
  }

  onsubmit(){
    this.visible=true;
  }



}
