import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../product/product';
import { ProductService } from '../product/product.service';

@Component({
  selector: 'app-delete-product',
  templateUrl: './delete-product.component.html',
  styleUrls: ['./delete-product.component.css']
})
export class DeleteProductComponent implements OnInit {
 @Input() prd: Product;
  prdstatus = false;
  submitted = false;

  constructor(private service: ProductService) {
    this.prd = new Product();
  }

  onSubmit() {
    this.service.deleteProduct(this.prd.id).subscribe(
         data=>{
           console.log(data);
            this.prd=data;
             this.prdstatus=true;
           },
   
         error=>{
           this.prdstatus=false;
           console.log(error);
         }
    )
    this.submitted=true;
 }

  ngOnInit(): void {
  }

}
