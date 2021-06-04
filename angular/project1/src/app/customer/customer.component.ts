import { Component, OnInit, Input } from '@angular/core';
import { Customer } from './customer';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  cust:Customer=new Customer(887890,'hello',8787870);
  //cust!.values
  
   
  constructor() { 
	  this.cust=new Customer(0,'',0);
	  }
onSubmit(){
  
}
  ngOnInit(): void {
  }

}
