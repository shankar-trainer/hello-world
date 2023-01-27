import { Component } from '@angular/core';
import { product } from './product';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  prd: product;
  prd1: product[];
  prdImage: string;
  prdImageWidth: number;
  prdImageHeight: number;

  prdImageArr: string[];
  constructor() {
    this.prdImageArr = [
      'https://images.unsplash.com/photo-1505740420928-5e560c06d30e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZHVjdHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60',
      'https://images.pexels.com/photos/90946/pexels-photo-90946.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
      'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9gx81fwphBfttvkOELl1BGt7B9GhPDnFne2m7yPXtiQ&s',
      'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgQKx9km008p_qRy1Ps-VUMKC2u2kOGEKcYiuaOUo9&s',
      'https://images.unsplash.com/photo-1523275335684-37898b6baf30?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZHVjdHxlbnwwfHwwfHw%3D&w=1000&q=80',
      'https://burst.shopifycdn.com/photos/wrist-watches.jpg?width=1200&format=pjpg&exif=1&iptc=1',
      'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTk7J9Drudmpq11verLZQfl7veVp4aIZUpHYxgiU_U1&s',
      'https://sb.kaleidousercontent.com/67418/1920x1280/fc5c592a71/product-image-cutouts-now-available.jpg',
      'https://media.istockphoto.com/id/1136422297/photo/face-cream-serum-lotion-moisturizer-and-sea-salt-among-bamboo-leaves.jpg?s=612x612&w=0&k=20&c=mwzWVrDvJTkHlVf-8RL49Hs5xjuv1TrYcBW4DnWVt-0='
    ]
    this.prdImage = 'https://images.unsplash.com/photo-1505740420928-5e560c06d30e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZHVjdHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60'
    this.prdImageWidth = 200;
    this.prdImageHeight = 200;
    this.prd = new product();
    this.prd.prdid = 8989798;
    this.prd.prdname = 'mobile';
    this.prd.prdcost = 10000;

    this.prd1 = [
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
    ]
  }
  method1(){
    alert('product id '+this.prd.prdid+'\nproduct name '+this.prd.prdname+'\nproduct cost'+this.prd.prdcost)
   }
     
}
