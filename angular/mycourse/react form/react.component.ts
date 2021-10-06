import { Component, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators
} from '@angular/forms';

@Component({
  selector: 'app-react',
  templateUrl: './react.component.html',
  styleUrls: ['./react.component.css']
})
export class ReactComponent {
  loginForm: FormGroup;
  username: FormControl;
  password: FormControl;
  constructor(builder: FormBuilder) {
    this.username = new FormControl('', [
      Validators.required,
      Validators.minLength(5)
    ]);
    this.password = new FormControl('',
      [Validators.required]);
    this.loginForm = builder.group({
      username: this.username,
      password: this.password
    });
  }

  login() {
    console.log(this.loginForm.value);
    // Attempt Logging in...
  }
}
