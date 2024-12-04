import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Observable } from "rxjs";
import { Customer } from './model/customer';
import { CustomerService } from './service/customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-getallcustomer',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './getallcustomer.component.html',
  styleUrl: './getallcustomer.component.css'
})
export class GetallcustomerComponent {
  customerlist:Observable<Customer[]>;
  
  constructor(private service:CustomerService,private router:Router){
    this.customerlist= service.getAllCustomer();
  }

  goto_addCustomer(){
     this.router.navigate(['add customer'])
  }

}
