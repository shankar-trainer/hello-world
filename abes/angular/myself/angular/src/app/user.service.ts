import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  getUser(){
    return [
       {"id":1001,"name":"mohan kumar","salary":20000},
       {"id":1002,"name":"p kumar","salary":23000},
       {"id":1003,"name":"umesh kumar","salary":32000},
       {"id":1004,"name":"anil kumar","salary":40000},
       {"id":1005,"name":"sunil kumar","salary":80000},
       {"id":1006,"name":"navin kumar","salary":90000},
    ];
  }
  constructor() { 
   
  }
}
