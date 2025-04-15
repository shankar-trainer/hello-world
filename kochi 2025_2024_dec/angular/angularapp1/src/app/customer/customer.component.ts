import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Customer } from './model/customer';

@Component({
  selector: 'app-customer',
  imports: [CommonModule,FormsModule],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {
@Input() customer:Customer;
visible:boolean=false;

  constructor(){
    this.customer=new Customer();
  }

  show(){
    this.visible=true;
  }
}
