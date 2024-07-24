import { UserService } from './../../services/user.service';
import { Component, inject } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css',
})
export class LoginComponent {
  loginObj: any = {
    EmailId: '',
    Password: ''
  };

  router = inject(Router);

  constructor(private usrService: UserService) {}

  login() {
  
    
    this.usrService.onLogin(this.loginObj).subscribe(
      (res: any) => {
        if (res.result) {
          localStorage.setItem('tokenData', JSON.stringify(res.data));
          this.router.navigateByUrl('dashboard');
        } else {
          alert(res.message);
        }
      },
      (error) => {
        console.log(error)
        alert('wrong credentials');
      }
    );
  }
}
