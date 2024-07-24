import {Component, OnInit} from '@angular/core';
import {AuthService} from "./_services/auth.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'angular-auth';

  constructor(private authService : AuthService) {
  }
  ngOnInit() {
    this.authService.autoLogin();
  }

}
