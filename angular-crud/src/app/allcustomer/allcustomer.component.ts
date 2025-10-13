import { Component } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Customer } from './model/customer';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-allcustomer',
  imports: [CommonModule],
  templateUrl: './allcustomer.component.html',
  styleUrl: './allcustomer.component.css'
})
export class AllcustomerComponent {

  // customer!: Observable<Customer[]>;
  customer!:Customer[];

  constructor(private service: CustomerService, private router:Router) {
    //  this.customer=service.getAllCustomer();
    service.getAllCustomer().subscribe((next) => {
      this.customer = next;
    },
      (error) => {

      }
    );
  }

  addRecord(){
    this.router.navigate(['add'])
  }

}
