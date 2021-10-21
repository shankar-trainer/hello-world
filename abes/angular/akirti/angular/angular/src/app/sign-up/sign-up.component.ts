//import { Component, OnInit } from '@angular/core';
import { Component, OnInit, ViewChild, AfterViewInit } from "@angular/core";
//import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import {NgForm} from '@angular/forms'; 
import {User} from '../shared/user.model';
import { ActivatedRoute,Router } from '@angular/router';
import { UserService } from '../shared/user.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})

export class SignUpComponent implements OnInit {
  rateForm: FormGroup;
 
  // user:User=new User();
  constructor(private route:ActivatedRoute,private service:UserService,private router:Router , private formBuilder: FormBuilder) { }

  ngOnInit():void {
    this.rateForm = this.formBuilder.group({
      username: ["", Validators.required],
      userpassword: ["", Validators.required]
      });
     }
     

    onSubmit(){
      
const myObj = {
userName: this.rateForm.value.username.toString(),
userPassword: this.rateForm.value.userpassword.toString()
};

const myObjStr = JSON.stringify(myObj);


        this.service.saveUser(myObjStr).subscribe(
          data => {console.log(data);
          this.router.navigate([`/success`]);
        },
          error =>{ console.log("exception occured");}
        );
    }
    
    

    // formInit() {
    //   alert("#########@@@@@")
    //   this.rateForm = this.formBuilder.group({
    //   username: ["", Validators.required],
    //   userpassword: ["", Validators.required]
    //   });
    //   }
    

  }


