import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private router:Router, private authenticationService:AuthenticationService) { }

  ngOnInit(){
    
      this.authenticationService.logOut();
      this.router.navigate(['login']);
   
  }
}
