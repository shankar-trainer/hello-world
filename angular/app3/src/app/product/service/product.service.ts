import { Injectable } from '@angular/core';
import { prddata } from '../data/product.data';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  constructor() { }

  getProduct() { 
    return prddata;
  }

}
