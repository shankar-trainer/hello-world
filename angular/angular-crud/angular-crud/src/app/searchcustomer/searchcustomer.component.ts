import { Component, Input } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';
import { Customer } from '../allcustomer/model/customer';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-searchcustomer',
  imports: [CommonModule, FormsModule],
  templateUrl: './searchcustomer.component.html',
  styleUrl: './searchcustomer.component.css'
})
export class SearchcustomerComponent {
  @Input() id: number = 0;
  c1: Customer;
  msg: string = '';

  constructor(private service: CustomerService, private router: Router) {
    this.c1 = {
      "id": 0,
      "name": "",
      "salary": 0,
      "dob": "",
    }
  }
  searchbyId() {
    console.log(" search by id " + this.id);

    this.service.searchCustomerById(this.id).subscribe((next) => {
      this.c1 = next;
      this.msg = "Record found"
      console.log(' found ' + this.c1)
    },
      (error) => {
        console.log('error ', error)
        this.msg = error.error
        //this.c1=error.error 
        console.log('error error  ', error.error)
      }
    )

  }
  searchbyId1() {
    console.log(" search by id " + this.id);

    this.service.searchCustomerById(this.id).subscribe((next) => {
      this.c1 = next;
      console.log(' found ' + this.c1)
    },
      (error) => {
        console.log('error ', error)
        this.msg = error.error
        this.c1 = error.error
        console.log('error error  ', error.error)
      }
    )

  }

  gotoshowAll() {
    this.router.navigate(['all'])
  }
  gotoadd() {
    this.router.navigate(['add'])
  }



}
