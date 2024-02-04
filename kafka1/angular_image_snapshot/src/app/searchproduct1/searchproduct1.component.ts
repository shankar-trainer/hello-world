import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Product1 } from '../product1/Product1';

@Component({
  selector: 'app-searchproduct',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './searchproduct1.component.html',
  styleUrl: './searchproduct1.component.css'
})
export class SearchproductComponent1 {
   prd:Product1;
  constructor(private route:ActivatedRoute){
    this.prd=new Product1();
  }

  ngOnInit(): void {

    this.prd.id=this.route.snapshot.params['id']
     this.prd.name=this.route.snapshot.params["name"];
     this.prd.cost=this.route.snapshot.params["cost"];
    }
}
