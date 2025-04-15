import { Component } from '@angular/core';
import { Product } from './model/product';

@Component({
  selector: 'app-product',
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  product:Product=new Product();

  imgsrc:string="./assets/book1.jfif";

  constructor(){
    this.product.id=90909;
    this.product.name="java book";
    this.product.cost=1200;
    this.product.mfd=new Date('2022-11-12');
   
  }

  bookData(){
    alert(`Product Information\nId  ${this.product.id} \nName  ${this.product.name} \nCost ${this.product.cost}\nMfd ${this.product.mfd}`)
  }
}



