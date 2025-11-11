import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-login1',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './login1.html',
  styleUrl: './login1.css',
})
export class Login1 {

  loginForm?:any;
  constructor(private fb:FormBuilder){

  }
  ngOnInit(): void {
    //Called after the constructor, initializing input properties, and the first call to ngOnChanges.
    //Add 'implements OnInit' to the class.
    this.loginForm=this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    })
    
  }
  // get f() { return this.loginForm.controls; }

onSubmit(){
  }

}
