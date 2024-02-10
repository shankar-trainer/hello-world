import {Component, Input} from '@angular/core';
import {Router} from "@angular/router";
import {AuthenticationService} from "../service/authentication.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  username = ''
  password = ''
  invalidLogin = false

  @Input() error: string | null;

  constructor(private router: Router,
              private loginservice: AuthenticationService) {
  }

  ngOnInit() {
  }

  checkLogin() {
    (this.loginservice.authenticate(this.username, this.password).subscribe(
        data => {
          this.router.navigate([''])
          this.invalidLogin = false
        },
        error => {
          this.invalidLogin = true
          this.error = error.message;
            console.log(error)
        }
      )
    );

  }

}

