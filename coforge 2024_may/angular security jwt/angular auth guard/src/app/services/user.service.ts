import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  public $refreshToken = new Subject<boolean>();
  public $refreshTokenReceived = new Subject<boolean>();

  constructor(private http: HttpClient) {
    this.$refreshToken.subscribe((res: any) => {
      this.getRefreshToken();
    });
  }

  onLogin(obj: any) {
    return this.http.post('https://freeapi.gerasim.in/api/JWT/login', obj);
  }

  getUsers() {
    return this.http.get('https://freeapi.gerasim.in/api/JWT/GetAllUsers');
  }

  getRefreshToken() {
    let loggedUserData: any;
    const localData = localStorage.getItem('tokenData');
    if (localData != null) {
      loggedUserData = JSON.parse(localData);
    }
    const obj = {
      emailId: loggedUserData.emailId,
      token: '',
      refreshToken: loggedUserData.refreshToken,
    };

    this.http
      .post('https://freeapi.gerasim.in/api/JWT/refresh', obj)
      .subscribe((res: any) => {
        localStorage.setItem('tokenData', JSON.stringify(res.data));
        this.$refreshTokenReceived.next(true);
      });
  }
}
