import { Component, OnInit } from '@angular/core';
import { MyproductService } from '../myproduct.service';
import { Router } from '@angular/router';
import { MyProduct } from '../myproduct/myproduct';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.css']
})
export class CreateProductComponent implements OnInit {
  prd:MyProduct;
  submitted=false;

  constructor(private service:MyproductService,private router:Router) { 
    this.prd=new MyProduct();
  }

  ngOnInit(): void {
  }
   
  newProduct():void{
    this.submitted=false;
    //this.prd=new MyProduct();

  }
  onSubmit(){
    //console.log('on submit called')
    this.submitted=true;
    this.save();
  }

  save(){
    //console.log('save called')
    this.service.saveProduct(this.prd).subscribe(
      data=>console.log(data),error=>console.log(error));
      this.prd=new MyProduct();
      this.gotoList();
  }

  gotoList(){
    this.router.navigate(['/myproduct']);
  }

}
