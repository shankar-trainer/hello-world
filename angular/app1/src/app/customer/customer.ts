import { Component } from '@angular/core';
import { cdata } from './data/customer_data';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { customerModel } from './model/customerModel';
import { SquarePipe } from './square-pipe';

@Component({
  selector: 'app-customer',
  imports: [FormsModule,CommonModule,SquarePipe],
  templateUrl: './customer.html',
  styleUrl: './customer.css',
})
export class Customer {

  customer:customerModel[];
  dob:Date;

  constructor(){
     this.dob=new Date('2022-10-11');
    this.customer=cdata;
  }

}
