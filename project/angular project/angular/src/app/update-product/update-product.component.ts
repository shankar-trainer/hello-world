import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MyproductService } from '../myproduct.service';
import { MyProduct } from '../myproduct/myproduct';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {
  id: number=0;
  prd: MyProduct;

  constructor( private route: ActivatedRoute, private service: MyproductService, private router: Router) { 
    this.prd=new MyProduct()
  }

  ngOnInit(): void {
    //this.prd=new MyProduct();
    this.id=this.route.snapshot.params['id']; 
    
    this.service.searchProduct(this.id).subscribe(
     data=>{
       console.log(data)
        this.prd=data;
     },
     error=>console.log(error)
    );
   }

   updateProduct(){
      this.service.updateProduct(this.prd).subscribe(
        data=>console.log(data),
        error=>console.log(error)
      )
    this.gotoList();  
   }

   onSubmit(){
     this.updateProduct()
   }

   gotoList(){
     this.router.navigate(['/myproduct'])
   }

}
