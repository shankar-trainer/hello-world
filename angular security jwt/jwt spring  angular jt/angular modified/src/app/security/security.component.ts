import { Component, OnInit } from '@angular/core';
import { JwtclientService } from '../jwtclient.service';
import * as jwt_decode from "jwt-decode";

@Component({
  selector: 'app-security',
  standalone: true,
  imports: [],
  templateUrl: './security.component.html',
  styleUrl: './security.component.css'
})
export class SecurityComponent {
  // authRequest: any = {
  //   "email": "mohan@gmail.com",
  //   "password": "1234"
  // };

  authRequest: any = {
    "userName": "user1",
    "password": "pwd1"
  };

  response: any;

  constructor(private service: JwtclientService) { }

  ngOnInit() {
    this.getAccessToken(this.authRequest);
  }
  //22,28,34
  public getAccessToken(authRequest: any) {
    let resp = this.service.generateToken(authRequest);
    console.log("jwt  token " + JSON.stringify(resp))
    console.log("auth request  " + JSON.stringify(authRequest))
    //resp.subscribe((data: any) => this.accessApi(data),error=>console.log("error is "+JSON.stringify(error)));
    // resp.subscribe((data: any) => this.accessApi(data),error=>console.log("error is "+JSON.stringify(error)));

    //resp.subscribe(data=>this.accessApi(jwt_decode(data)));
    //resp.subscribe(data => this.accessApi(JSON.stringify(data)));
    //resp.subscribe(data => this.accessApi('Jwt'+':'+data.toString()));
    resp.subscribe((data: any) => this.accessApi(JSON.stringify(data)),error=>console.log("error is "+JSON.stringify(error)));
  }


  public accessApi(token: any) {
    let resp = this.service.welcome(token);
    resp.subscribe((data: any) => this.response = data, error => console.log(error));
  }
}
