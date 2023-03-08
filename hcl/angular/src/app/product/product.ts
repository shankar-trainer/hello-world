export class Product{
    name:string;
    price:number;
    imageUrl:string;
    stock:number;
   
   
    constructor( name:string,price:number, imageUrl:string, stock:number ){
      this.name=name;
      this.price=price;
     this.imageUrl=imageUrl;
     this.stock=stock;
     }
   
   }