import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../product/product';
import { ProductService } from '../product/product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.css']
})
export class CreateProductComponent implements OnInit {

  @Input() prd: Product;
  submitted = false;
  prdstatus = false;
  msg: string = '';

  constructor(private service: ProductService, private router: Router) {
    this.prd = new Product();
    console.log("submitted "+this.submitted);
  }

  onSubmit() {
    this.service.saveProduct(this.prd).subscribe(
      data => {
        console.log(data)
        this.prdstatus = true;
      }
      , error => {
        this.prdstatus = false;
        //console.log("error is "+error.error)
        console.log("error is... " + error)
        this.msg = error.error
      }
    );
    this.submitted = true;
  }

  showall() {
    this.router.navigate(['/showall'])
  }

  ngOnInit(): void {
  }
}
