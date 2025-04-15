//import { Component } from '@angular/core';
import { JwtClientService } from '../jwt-client.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-security',
  imports: [CommonModule,FormsModule],
  templateUrl: './security.component.html',
  styleUrl: './security.component.css'
})
export class SecurityComponent implements OnInit {

  authRequest: any = {
  "username":"Basant",
  "password":"Pwd1"  
  };

  response: any;

  constructor(private service: JwtClientService) { }

  ngOnInit() {
    this.getAccessToken(this.authRequest);
  }

  public getAccessToken(authRequest:any) {
    let resp = this.service.generateToken(authRequest);
    resp.subscribe(data => this.accessApi(data));
  }


  public accessApi(token:any) {
    let resp = this.service.welcome(token);
    resp.subscribe(
      data => {
        this.response = data
         console.log("data ",data);
         console.log("response ",this.response);
      },
      error=>{
        console.log(error)
      }   
    );
  }
}
