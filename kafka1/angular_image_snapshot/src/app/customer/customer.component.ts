import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {

  x:number[];
   img:string[];
  constructor(){
    this.x=[
      111,222,333,444
    ]
    this.img=[
      "img1",
      "img2",
      "img3",
      "img4",
    ]
  }
}
