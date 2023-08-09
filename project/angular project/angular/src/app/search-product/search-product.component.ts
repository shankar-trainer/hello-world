import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MyproductService } from '../myproduct.service';
import { MyProduct } from '../myproduct/myproduct';

@Component({
  selector: 'app-search-product',
  templateUrl: './search-product.component.html',
  styleUrls: ['./search-product.component.css']
})
export class SearchProductComponent implements OnInit {
  id: number=0;
  prd: MyProduct;
  prdstatus=false;

  constructor( private route: ActivatedRoute, private service: MyproductService, private router: Router) { 
    this.prd=new MyProduct()


  }

  ngOnInit(): void {
    this.prd=new MyProduct();
    //this.id=this.route.snapshot.params['id']; 
   // this.searchProduct();
   }

   searchProduct(){
    //this.id=this.route.snapshot.params['id']; 
    //this.id=this.prd.prdId;

    console.log("search id is "+this.id)
    this.service.searchProduct(this.prd.prdId).subscribe(
      data=>{
        console.log(data)
         this.prd=data;
         this.prdstatus=true;
      },
      error=>{console.log(error)
        this.prdstatus=false;
      }
     );
     //this.gotoList();  
   }

   onSubmit(){
     this.searchProduct()
   }

   gotoList(){
     this.router.navigate(['/myproduct'])
   }

}
