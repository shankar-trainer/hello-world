import { Component, OnInit } from '@angular/core';
import { User } from './user';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { UserProfileService } from './user-profile.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {
  user:User=new User();
 editMode:boolean=false;
 showMsg:boolean=false;

 updateForm: FormGroup;

  userName:FormControl;
  phoneNumber:FormControl;
  aadhaarNo:FormControl;
  loginName:FormControl;
  password:FormControl;

  constructor(builder:FormBuilder, private service:UserProfileService,private router:Router) {
    this.loginName=new FormControl({value: '', disabled: !this.editMode},[Validators.required]);
    this.password=new FormControl({value: '', disabled: !this.editMode}, [Validators.required , Validators.minLength(8)]);
    this.aadhaarNo=new FormControl({value: '', disabled: !this.editMode},[Validators.required, Validators.minLength(12)]);
    this.phoneNumber=new FormControl({value: '', disabled: !this.editMode},[Validators.required, Validators.minLength(10)]);
    this.userName=new FormControl({value: '', disabled: !this.editMode},[Validators.required]);
    
    this.updateForm=builder.group({
      loginName:this.loginName,
      password:this.password,
      aadhaarNo:this.aadhaarNo,
      phoneNumber:this.phoneNumber,
      userName:this.userName
    });
  }
  

  ngOnInit(): void {
    
    this.service.searchUser(sessionStorage.getItem('userId')).subscribe(
      data=>{
       console.log(data)
       this.user=data;
       console.log(this.user.userName)
       console.log(this.user.phoneNumber)
       console.log(this.user.password)
       console.log(this.user.loginName)
       console.log(this.user.aadhaarNo)
      },
      error=>console.log(error)
    );
  }
  onEdit(){
    
  }
  onUpdate(){
    
  }
  onCancel(){
    
  }
  onDelete(){
    
  }
  onView(){

  }
}
