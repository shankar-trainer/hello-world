import { Injectable } from '@angular/core';
import { UserProfileService } from '../user-profile/user-profile.service';
import { Router } from '@angular/router';
import { isEmptyExpression } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  user_id:any;
 
  constructor(private service:UserProfileService,private router:Router) { }

  authenticate(loginName, password) {
    
    this.service.validLogin(loginName, password).subscribe(
      data=>{
       console.log(data)
       this.user_id=data;
      },
      error=>console.log(error)
    );
    console.log(this.user_id)
    if (this.user_id==null) {
     
      return false;
    } else {
      sessionStorage.setItem('userId', this.user_id)
      return true;
    }
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('userId')
   // console.log(!(user === null))
    return !(user === null)
  }

  logOut() {
    sessionStorage.removeItem('userId')
  }
}
