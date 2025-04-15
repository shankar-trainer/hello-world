import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";
import { AuthServiceService } from './auth-service.service';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private url = "http://localhost:8080"
  constructor(private http: HttpClient, private router: Router) { }


  login(username: string, password: string){
    return this.http.post(this.url + "/user/login", {username, password})
  }
}
