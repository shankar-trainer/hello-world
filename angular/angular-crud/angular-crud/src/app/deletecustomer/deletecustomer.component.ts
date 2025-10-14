import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';
import { Customer1 } from '../addcustomer/model/customer1';
import { Customer } from '../allcustomer/model/customer';

@Component({
  selector: 'app-deletecustomer',
  imports: [CommonModule, FormsModule],
  templateUrl: './deletecustomer.component.html',
  styleUrl: './deletecustomer.component.css'
})
export class DeletecustomerComponent {
  @Input() id: number;
  c1: Customer;
  msg: string = '';

  constructor(private service: CustomerService, private router: Router) {
    this.id = 0;
    this.c1 = {
      "id": 0,
      "name": "",
      "salary": 0,
      "dob": "",
    }
  }
  deleteById() {

    this.service.deleteCustomerById(this.id).subscribe(next => {
      this.c1 = next;
      this.msg = "record deleted"
    },
      error => {

      }
    );
  }

  gotoshowall() {
    this.router.navigate(['all'])
  }

  gotoadd() {
    this.router.navigate(['add'])
  }


}
