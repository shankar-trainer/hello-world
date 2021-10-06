import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin/admin';
import { ActivatedRoute } from '@angular/router';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {
  id:number;
  usr:Customer;

  constructor(
    private route:ActivatedRoute,
    private service:CustomerService,
    private router:Router) { }

  ngOnInit(): void {
    this.usr = new Customer();
    this.id=this.route.snapshot.params['id'];
 
    this.service.searchCustomer(this.id).subscribe(
      data=> {this.usr=data},
      error=> console.log(error)
    );
  }
  gotoList(){
    this.router.navigate(['customer']);
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

