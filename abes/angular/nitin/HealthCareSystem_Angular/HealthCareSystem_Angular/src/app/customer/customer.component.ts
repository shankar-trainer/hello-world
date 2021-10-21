import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable, from } from 'rxjs';
import { Router } from '@angular/router';
import {CustomerService} from '../customer.service';
import { Customer } from '../customer';
import { AuthenticationService } from '../service/authentication.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  customer: Observable<Customer[]>;
  usr= new Customer()


  customer_data: string[];
  constructor(private service: CustomerService,
     private router: Router,
     private loginService:AuthenticationService
     ) {
    this.customer = service.getCustomerList();
    this.router.navigate(['myappointment']);
  }

  ngOnInit(): void {
    this.reloadData();
  }
  reloadData() {
    console.log('reload Data called!!')
    this.customer = this.service.getCustomerList();
  }
  deleteCustomer(id: number) {
    this.service.deleteCustomer(id)
    .subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log(error)
    );
  }

  updateCustomer(id: number) {
    this.router.navigate(['updateCustomer', id]);
  }
  detailsCustomer(id: number) {
    this.router.navigate(['customerDetails', id]);
  }

  goHome(){
    this.router.navigate(['home']);
  }
  goCustomer(){
    this.router.navigate(['customer']);
  }
  goAddCustomer(){
    this.router.navigate(['addCustomer']);
  }
  goAddAppointment(){
    this.router.navigate(['addappointment']);
  }
  goAppointments(){
    this.router.navigate(['myappointment']);
  }
}
