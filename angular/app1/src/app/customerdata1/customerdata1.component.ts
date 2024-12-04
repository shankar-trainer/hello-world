import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from '../customer/model/customer';

@Component({
  selector: 'app-customerdata',
  standalone: true,
  imports: [],
  templateUrl: './customerdata1.component.html',
  styleUrl: './customerdata1.component.css'
})
export class Customerdata1Component {

  id:number=0;
  name:string='';
  salary:number=0;
  country:string='';
  capital:any='';

  constructor(private router: Router, private route: ActivatedRoute) {
  }
  ngOnInit(): void{
    this.id=this.route.snapshot.params['id'];
    this.name=this.route.snapshot.params['name'];
    this.salary=this.route.snapshot.params['salary'];
    this.country=this.route.snapshot.params['country'];
    this.capital=sessionStorage.getItem('capital')
  }
}

//http://localhost:4200/customerdata1/65656/ram%20kumar%20sharm/12000/hindustan
