import { Component, OnInit } from '@angular/core';
import { UserProfileService } from '../user-profile/user-profile.service';
import { Router } from '@angular/router';
import { User } from '../user-profile/user';
import { FormControl, FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {
  registrationForm: FormGroup;

  userName:FormControl;
  phoneNumber:FormControl;
  aadhaarNo:FormControl;
  loginName:FormControl;
  password:FormControl;

  user:User=new User();
  submitted=false;
  showMsg: boolean = false;
  
  constructor(builder:FormBuilder, private service:UserProfileService,private router:Router) {
    this.loginName=new FormControl("",[Validators.required]);
    this.password=new FormControl("",[Validators.required , Validators.minLength(8)]);
    this.aadhaarNo=new FormControl("",[Validators.required, Validators.minLength(12)]);
    this.phoneNumber=new FormControl("",[Validators.required, Validators.minLength(10)]);
    this.userName=new FormControl("",[Validators.required]);
    
    this.registrationForm=builder.group({
      loginName:this.loginName,
      password:this.password,
      aadhaarNo:this.aadhaarNo,
      phoneNumber:this.phoneNumber,
      userName:this.userName
    });
  }
   

  ngOnInit(): void {
  }

  onSubmit(){
    console.log('on submit called')
    this.submitted=true;
    
    this.save();
  }

  save(){
    console.log('save called')

    this.user.aadhaarNo = this.aadhaarNo.value;
    this.user.loginName = this.loginName.value;
    this.user.password = this.password.value;
    this.user.phoneNumber = this.phoneNumber.value;
    this.user.userName = this.userName.value;
    
    this.service.addUser(this.user).subscribe(
      data=>{
        this.showMsg=true
        console.log(data+" -------- "+  this.showMsg)
        ,error=>console.log(error)
        
    });
      this.user=new User();
      
  }

  onSignin(){
    this.router.navigate(['/login']);
  }

}
