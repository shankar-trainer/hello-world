import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Customer } from '../getallcustomer/model/customer';
import { CustomerService } from '../getallcustomer/service/customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchcustomer',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './searchcustomer.component.html',
  styleUrl: './searchcustomer.component.css'
})
export class SearchcustomerComponent {

 @Input() c: Customer;
 @Input() c1: Customer;
 
  msg: string = '';
  data1:string='';
  visible: boolean = false;
 
  constructor(private service:CustomerService,private  router:Router){
   this.c=new Customer();
   this.c1=new Customer();
  }

  searchRecord(){
    this.visible=true;
    this.service.searchCustomerById(this.c.customerId).subscribe(data=>{
      this.c1=data;
      this.msg="Record found"
    },
    error=>{
     // console.log("error "+JSON.stringify(error))
       this.msg=error.error
    }
  );
    //this.service
  }
}
