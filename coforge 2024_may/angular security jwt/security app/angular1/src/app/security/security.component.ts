import { Component, OnInit } from '@angular/core';
import { JwtclientService } from '../jwtclient.service';

@Component({
  selector: 'app-security',
  standalone: true,
  imports: [],
  templateUrl: './security.component.html',
  styleUrl: './security.component.css'
})
export class SecurityComponent {
  authRequest: any = {
    "email": "mohan@gmail.com",
    "password": "1234"
  };

  response: any;

  constructor(private service: JwtclientService) { }

  ngOnInit() {
    this.getAccessToken(this.authRequest);
  }
//22,28,34
  public getAccessToken(authRequest: any) {
    let resp = this.service.generateToken(authRequest);
    console.log("jwt  token "+JSON.stringify(resp))
    resp.subscribe((data: any) => this.accessApi(data));
  }


  public accessApi(token: any) {
    let resp = this.service.welcome(token);
    resp.subscribe((data: any) => this.response = data);
  }
}
