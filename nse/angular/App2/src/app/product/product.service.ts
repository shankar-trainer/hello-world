import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor() { }
  getProduct(){
  return  [
      { prdid: 10001, prdname: 'java book', prdcost: 1200 },
      { prdid: 10002, prdname: 'spring in action', prdcost: 1800 },
      { prdid: 10003, prdname: 'java for beginner', prdcost: 1100 },
      { prdid: 10004, prdname: 'nodejs book', prdcost: 600 },
      { prdid: 10005, prdname: 'microservice for beginner', prdcost: 1300 },
      { prdid: 10006, prdname: 'Freeze', prdcost: 18000 },
      { prdid: 10007, prdname: 'television', prdcost: 20000 },
      { prdid: 10008, prdname: 'bike', prdcost: 190000 },
      { prdid: 10009, prdname: 'car', prdcost: 120000 },
      { prdid: 100010, prdname: 'table', prdcost: 4000 },
      { prdid: 100011, prdname: 'gas stove', prdcost: 3000 }
    ];

  }
}
