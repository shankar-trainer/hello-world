import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from './authentication.service';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  loginName:FormControl;
  password:FormControl;
  validLogin:boolean = true

  constructor(builder:FormBuilder, private router:Router, private authenticationService:AuthenticationService) { 
    this.loginName=new FormControl("",[Validators.required]);
    this.password=new FormControl("",[Validators.required]);
    this.loginForm=builder.group({
      loginName:this.loginName,
      password:this.password,
    });
  }

  ngOnInit(): void {
  }
  checkLogin() {
    if (this.authenticationService.authenticate(this.loginName.value, this.password.value)){
      this.router.navigate(['/userprofile'])
     
    } else{
      this.validLogin = false

    }
  }

  onRegister(){
    this.router.navigate(['/create']);
  }
}
