import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-searchproduct',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './searchproduct.component.html',
  styleUrl: './searchproduct.component.css'
})
export class SearchproductComponent {
  prdid:number=0;
  prdname:string='';
  prdcost:number=0;
  
  constructor(private route:ActivatedRoute){}

  ngOnInit(): void {
    this.prdid=this.route.snapshot.params['id']
    this.prdname=this.route.snapshot.params['name']
    this.prdcost=this.route.snapshot.params['cost']
  }
}
