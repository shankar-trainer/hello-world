import { Component } from '@angular/core';
import { Customer } from '../model/customer';

@Component({
  selector: 'app-customersearch',
  standalone: true,
  imports: [],
  templateUrl: './customersearch.component.html',
  styleUrl: './customersearch.component.css'
})
export class CustomersearchComponent {

  id:number=0;
  customer:Customer;
  status:boolean=false;;

  constructor(){
    this.customer=new Customer();
  }

}
