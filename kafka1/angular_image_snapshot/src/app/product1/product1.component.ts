import { Component, Input } from '@angular/core';
import { Product1 } from './Product1';
import { CommonModule } from '@angular/common';
import {  Router, RouterLink, RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-product1',
  standalone: true,
  imports: [CommonModule,FormsModule, RouterOutlet, RouterLink],
  templateUrl: './product1.component.html',
  styleUrl: './product1.component.css'
})
export class ProductComponent1 {
  @Input() prd:Product1[];
  @Input() id:number=0;
  //@Input() id:string='';
  
   constructor(private router:Router){
    this.prd=[
      {"id":10001,"name":"book","cost":1200},
      {"id":10002,"name":"shirt","cost":900},
      {"id":10003,"name":"pant","cost":1600},
      {"id":10004,"name":"icecream","cost":100},
      {"id":10005,"name":"laddu","cost":230},
      {"id":10006,"name":"shoe","cost":1400},
    ]
   }
   search(){
    this.router.navigate(['/searchproduct2',this.id])
     //this.router.navigate(['/searchproduct',id1])
   }
  }
  