import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from '../admin.service';
import { CustomerService } from '../customer.service';
import {AuthenticationService} from '../service/authentication.service';
 
@Component({
  selector: 'app-home-login',
  templateUrl: './home-login.component.html',
  styleUrls: ['./home-login.component.css']
})
export class HomeLoginComponent implements OnInit {
id:string;
password:string;
invalidLogin=false;

submitted=false;

  constructor(
    private service1:AdminService,
    private service:CustomerService, 
    private router:Router,
    private route:ActivatedRoute,
    private loginservice: AuthenticationService)  { }

  ngOnInit(): void {

    this.id=this.route.snapshot.params['id'];
  }

  
  checkLogin1(){
    if (this.loginservice.authenticate(this.id, this.password)
    ) {
      this.router.navigate(['admin'])
      this.invalidLogin = false
    } else
      this.invalidLogin = true
    
  }
  checkLogin2(){
    if (this.loginservice.authenticate(this.id, this.password)
    ) {
      this.router.navigate(['customer'])
      this.invalidLogin = false
    } else
      this.invalidLogin = true
    
  }
  
  signUp(){
    this.router.navigate(['addCustomer']);
  }

}
