import { Component, OnInit } from '@angular/core';
import { MyProduct } from './myproduct';
import { Observable } from 'rxjs';
import { MyproductService } from '../myproduct.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-myproduct',
  templateUrl: './myproduct.component.html',
  styleUrls: ['./myproduct.component.css']
})
export class MyproductComponent implements OnInit {

  product: Observable<MyProduct[]>;
  constructor(private service: MyproductService, private router: Router) {
    this.product = this.service.getProductList();
  }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.product = this.service.getProductList();
  }

  deleteProduct(id: number) {

    this.service.removeProduct(id).subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log(error)
    );
  }

  productDetail(id: number) {
    this.router.navigate(['detail', id]);
  }

  updateProduct(id: number) {
    this.router.navigate(['update', id]);
  }
}
