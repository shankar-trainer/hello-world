import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { ProductData } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  
  prd1:Product;
  prd2:Product;
  prd3:Product;
  
  product:Product[];
  
  image1:string;
  image2:string;
  imageW:number;
  imageH:number;
  
  city:string;

  constructor() {
     this.city='delhi';
     
    this.prd1=new Product(1001,'angular book',1500);
    this.prd2=new Product(1002,'steel table',2000);
    this.prd3=new Product(1003,'chair',1200);
    this.image2='assets/flower.jpg'
    this.imageH=200
    this.imageW=300

    this.image1='';
 
    this.product=[
      new Product(8001,'angular in action',1500),
      new Product(8002,'learning angular',1200),
      new Product(8003,'angular  with type typescript ',800),
      new Product(8004,'pro angular',1100),
      new Product(8005,'angular project',1200),
    ]    
    this.product=ProductData;

    this.product=[
      {prdId:5001,prdName:'angular book',prdCost:1500},
      {prdId:5002,prdName:'angular beginner',prdCost:100},
      {prdId:5003,prdName:'torch',prdCost:100},
      {prdId:5004,prdName:'laptop',prdCost:50500},
      {prdId:5005,prdName:'shirt',prdCost:1600},
      {prdId:5006,prdName:'pant',prdCost:2200},
    ]
  }

  hello(){
    alert(' hello how are you ' )
    alert(this.prd1.prdId+' \n  '+this.prd1.prdName+'  \n '+this.prd1.prdCost )
  }

  ngOnInit(): void {
  }

}
