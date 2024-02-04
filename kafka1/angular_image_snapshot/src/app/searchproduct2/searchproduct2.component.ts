import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductComponent } from '../product/product.component';
import { Product1 } from '../product1/Product1';
import { ProductComponent1 } from '../product1/product1.component';

@Component({
  selector: 'app-searchproduct2',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './searchproduct2.component.html',
  styleUrl: './searchproduct2.component.css'
})
export class Searchproduct2Component {
  prdid:number=0;

  prd:Product1;
  prd1:Product1[];
  status:boolean=false;
  prdcomp1:ProductComponent1;

  constructor(private route:ActivatedRoute, private router:Router){
    this.prd=new Product1();
    this.prdcomp1=new ProductComponent1(router);
    this.prd1=this.prdcomp1.prd;
  }

  ngOnInit(): void {
    this.prdid=this.route.snapshot.params['id']
    console.log('id  is  '+this.prdid)
    for (const p of this.prd1) {
      console.log(p.id)
      if(p.id==this.prdid){
        this.prd=p;
        this.status=true;
        console.log("found ......")
        break;
      }
    }
    // this.prdid=this.route.snapshot.paramMap.get("id");
  }
}
