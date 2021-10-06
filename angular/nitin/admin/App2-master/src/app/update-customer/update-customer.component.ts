import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable, from } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import {CustomerService} from '../customer.service';
import { Customer } from '../customer';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {
  id: number
  usr: Customer

  constructor(
    private route: ActivatedRoute,
    private service: CustomerService,
    private router: Router
    ) { }

  ngOnInit(): void {
    this.usr = new Customer();
    this.id = this.route.snapshot.params['id'];

    this.service.searchCustomer(this.id).subscribe(
      data => {
        this.usr = data
      },
      error =>
        console.log(error)
    );
  }

  updateCustomer(){
  this.service.updateCustomer(this.usr).subscribe(
    data=> console.log(data),
    error=>console.log(error)
  )
  this.goCustomer();
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
}