import { Component, OnInit } from '@angular/core';
import { MyTest } from '../mytest/mytest';
import { ActivatedRoute, Router } from '@angular/router';
import { MytestService } from '../mytest.service';

@Component({
  selector: 'app-test-details',
  templateUrl: './test-details.component.html',
  styleUrls: ['./test-details.component.css']
})
export class TestDetailsComponent implements OnInit {
  id:number;
  test:MyTest;
  
  constructor(private route:ActivatedRoute,private service : MytestService,private router: Router) { }

  ngOnInit(): void {
    this.test=new MyTest();
    this.id=this.route.snapshot.params['id'];
    this.service.searchtest(this.id).subscribe(
      data=>{
        console.log(data);
        this.test=data;
      },
      error=>console.log(error)
    );
  }
  list()
  {
    this.router.navigate(['test']);
  }

}
