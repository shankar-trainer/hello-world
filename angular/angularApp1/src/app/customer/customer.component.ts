import { Component, OnInit, Input } from '@angular/core';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer',
 
  template:`
  <div class='container bg-dark text-light' style='width:40%'  >
  <h1>Customer Program</h1>

  <label>Customer Id</label>
  <input [(ngModel)]='customer.custId'>
  <br>
  <label>Customer Name</label>
  <input [(ngModel)]='customer.custName'>
  <br>
  <label>Customer Salary</label>
  <input [(ngModel)]='customer.custSalary'>
  <br>
  
  <p>
      {{customer.custId}}<br>
      {{customer.custName}}<br>
      {{customer.custSalary}}<br>
 </div>
  `
 
  // templateUrl: './customer.component.html',
  //styleUrls: ['./customer.component.css']

})
export class CustomerComponent implements OnInit {
  @Input() customer:Customer;

  constructor() { 
    this.customer=new Customer(0,'',0);
  }

  ngOnInit(): void {
  }

}
