import { Component, OnInit, Input } from '@angular/core';
import { ProductService } from '../myproduct/product.service';
import { Product } from '../myproduct/product';

@Component({
  selector: 'app-searchproduct',
  templateUrl: './searchproduct.component.html',
  styleUrls: ['./searchproduct.component.css']
})
export class SearchproductComponent implements OnInit {
   prd:Product;
   prdstatus:boolean;
   submitted:boolean;
   msg:string;

  constructor(private service:ProductService) {
     this.prd=new Product();
      this.prdstatus=false;
      this.submitted=false;
      this.msg='';
    }

   onSubmit(){
     this.service.searchProduct(this.prd.id).subscribe(
       data=>{
         console.log(data);
         this.prd=data;
         this.prdstatus=true;
       },
       error=>{
         this.msg=error.error
        // console.log("error is "+error.error);
         //console.log(error.error.message);


         this.prdstatus=false;
       }
     )
     this.submitted=true;
   }

  ngOnInit(): void {
  }

}
