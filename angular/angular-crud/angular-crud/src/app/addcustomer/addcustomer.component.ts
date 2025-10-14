import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Observable } from 'rxjs';
import { Customer1 } from './model/customer1';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addcustomer',
  imports: [CommonModule, FormsModule],
  templateUrl: './addcustomer.component.html',
  styleUrl: './addcustomer.component.css'
})
export class AddcustomerComponent {

  c: Customer1;
  @Input()
  c1!: Customer1; 
  msg:string='';

  constructor(private service: CustomerService, private router:Router) {
    this.c = {
      "name": "",
      "salary": 0,
      "dob": "",
    }

    // this.c1 = {
    //   "name": "",
    //   "salary": 0,
    //   "dob": "",
    // }
  }

  addRecord() {
   //  this.service.addCustomer(this.c).subscribe();
     this.service.addCustomer(this.c).subscribe((next)=>{
       this.c1=next;
       this.msg="record added"
     },
     error=>{
      
     }
    );

    console.log("doctor added ",JSON.stringify(this.c1))
  }

  showall(){
     this.router.navigate(['all'])
  }

}
