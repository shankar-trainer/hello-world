import { Component } from '@angular/core';
import { Product } from './product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  product:Product[];

  constructor(){
    this.product=[
        {   
       "name":"Cone","price":10,"imageUrl":"assets/img/cone.jpeg",stock:200
        },
        
        {   
       "name":"Brighams","price":20,"imageUrl":"assets/img/brighams.png",stock:0
        },
        
        {   
       "name":"Milkshake","price":30,"imageUrl":"assets/img/milkshake.jpg",stock:500
        },
        
        {   
       "name":"Squeez","price":40,"imageUrl":"assets/img/squeeze.jpeg",stock:100
        },
    ]
  }

} 

 