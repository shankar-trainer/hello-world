import { Component, OnInit } from '@angular/core';
import { cdata } from './data/customer_data';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { customerModel } from './model/customerModel';
import { SquarePipe } from './square-pipe';

@Component({
  selector: 'app-customer',
  imports: [FormsModule, CommonModule, SquarePipe],
  templateUrl: './customer.html',
  styleUrl: './customer.css',
})
export class Customer implements OnInit {

  customer: customerModel[];
  dob: Date;
  bname: any;
  cost: any;
  isbn: any;
  status:boolean=false;

  constructor() {
    this.dob = new Date('2022-10-11');
    this.customer = cdata;
  }
  ngOnInit(): void {
    this.bname = localStorage.getItem('bname');
    this.cost = localStorage.getItem('cost');
    this.isbn = localStorage.getItem('isbn');
    if(this.bname!=null){
      this.status=true;
    } 
  }

}
