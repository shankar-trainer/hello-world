import { Component, Input } from '@angular/core';
import { Customer } from './customer';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {
  @Input() name:string='ram kumar';
  customer:Customer=new Customer();

  customer1:Customer[];
  img_src:string;
  img_width:number;
  img_height:number;
  
  constructor(){
    this.img_width=200;
    this.img_height=150;

    this.img_src="./image/flower1.webp"
    
    //this.img_src="https://media.istockphoto.com/id/533314469/photo/mustard-flower.jpg?s=2048x2048&w=is&k=20&c=SE3cslMydyrLGnHZXnFIBgfWCtMLYTNemHb722OSfqM="

    this.customer1=[
      {"customerId":10009,"customerName":"pawan kumar","customerSalary":20000},
      {"customerId":10001,"customerName":"amit kumar","customerSalary":25000},
      {"customerId":10005,"customerName":"raman kumar","customerSalary":14000},
      {"customerId":10008,"customerName":"shiv kumar","customerSalary":15000},
      {"customerId":10004,"customerName":"anand kumar","customerSalary":70000},
      {"customerId":10003,"customerName":"harish kumar","customerSalary":80000},
    ]    
  }
  customerClick(){
    alert("customer clicked")
  }
}
