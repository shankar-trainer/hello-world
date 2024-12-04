import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from '../customer/model/customer';

@Component({
  selector: 'app-customerdata',
  standalone: true,
  imports: [],
  templateUrl: './customerdata.component.html',
  styleUrl: './customerdata.component.css'
})
export class CustomerdataComponent {
  id1:number=0;
  name1:string='';
  salary1:number=0;
  country:string='';

  id:number=0;
  name:string='';
  salary:number=0;


  constructor(private router: Router, private route: ActivatedRoute) {
  }
  ngOnInit(): void{
    this.route.params.subscribe(params => {
      this.id1 = params['id']
      this.name1 = params['name']
      this.salary1 = params['salary']
    });
    this.id=this.route.snapshot.params['id'];
    this.name=this.route.snapshot.params['name'];
    this.salary=this.route.snapshot.params['salary'];

  }

}
//http://localhost:4200/customerdata;id=6666767677;name=ram%20kumar%20sharm;salary=12000
