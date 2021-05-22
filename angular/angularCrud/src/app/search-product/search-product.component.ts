import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../product/product';
import { ProductService } from '../product/product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search-product',
  templateUrl: './search-product.component.html',
  styleUrls: ['./search-product.component.css']
})
export class SearchProductComponent implements OnInit {
  //@Input() 
  prd: Product;
  msg:string='';
  prdstatus = false;
  submitted = false;
  constructor(private service: ProductService, private router: Router) {
    this.prd = new Product();
  }

  ngOnInit(): void {
  }

  onSubmit() {
     if(this.prd.id.toString()=='')
       alert('id is blank')
else{
    this.service.searchProduct(this.prd.id).subscribe(
      data => {
        console.log(data);
        this.prd = data;
        this.prdstatus = true;
      },

      error => {
        this.prdstatus = false;
        console.log(error);
        this.msg=error.error.message;
        console.log(this.msg);
        
      }
    )
    this.submitted = true;
  }}
  
  showall() {
    this.router.navigate(['/showall'])
  }
}
