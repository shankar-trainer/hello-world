import { Component } from '@angular/core';
import { Customer } from './customer';
import { CustomerData } from './data/customer.data';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent {


  customer:Customer[];
  constructor(){
    this.customer=CustomerData;
  }

}
