import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookService {
  getBooks(){
    return [
         {"isbn":78788,"name":"beginning to angular","author":"a kumar","cost":1200},
         {"isbn":78789,"name":"pro angular","author":"suresh kumar","cost":1300},
         {"isbn":78780,"name":"angular with typescript","author":"p kumar","cost":2100},
         {"isbn":78781,"name":"learning angular","author":"aman kumar","cost":1600},
         {"isbn":78782,"name":"angular in action","author":"jaiparkas kumar","cost":1800},
    ];
  }
  constructor() { }
}
