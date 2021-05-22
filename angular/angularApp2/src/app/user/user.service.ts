import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }

  getUser(){
    return [
        {"userId":1001,"userName":"aman kumar","userLocation":"lucknow"},
        {"userId":1002,"userName":"auman kumar","userLocation":"bhopal"},
        {"userId":1003,"userName":"raman kumar","userLocation":"bareli"},
        {"userId":1004,"userName":"pawan kumar","userLocation":"patna"},
        {"userId":1005,"userName":"amit kumar","userLocation":"ranchi"},
        {"userId":1006,"userName":"sumit kumar","userLocation":"banglore"},

    ];
  }
}
