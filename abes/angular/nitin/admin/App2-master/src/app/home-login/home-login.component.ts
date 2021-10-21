import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from '../admin.service';
import { Admin} from '../admin';
import { CustomerService } from '../customer.service';
 
@Component({
  selector: 'app-home-login',
  templateUrl: './home-login.component.html',
  styleUrls: ['./home-login.component.css']
})
export class HomeLoginComponent implements OnInit {
id:number;
password:string;

submitted=false;

  constructor(
    private service1:AdminService,
    private service:CustomerService, 
    private router:Router,
    private route:ActivatedRoute)  { }

  ngOnInit(): void {

    this.id=this.route.snapshot.params['id'];
  }

  
  onSubmit1(){
    this.service1.adminLogin(this.id,this.password)
    console.log('onsubmit called!')
    this.submitted=true;
  }

  onSubmit(){
    this.service.customerLogin(this.id,this.password)
    console.log('onsubmit called!')
    this.submitted=true;
  }
  
  signUp(){
    this.router.navigate(['addCustomer']);
  }

}
