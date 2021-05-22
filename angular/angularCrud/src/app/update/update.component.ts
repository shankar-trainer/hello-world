import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../product/product';
import { ProductService } from '../product/product.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  @Input() prd: Product;
  submitted = false;
  prdstatus = false;
  constructor(private service: ProductService) {
    this.prd = new Product();
  }

  onSubmit() {
    this.service.updateProduct(this.prd).subscribe(
      data => {
        console.log(data)
        this.prdstatus = true;
      }
      , error => {
        this.prdstatus = false;
        console.log(error)
        console.log(error.error)
      }
    );
    this.submitted = true;
  }
  ngOnInit(): void {
  }

}
