import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { MytestService } from '../mytest.service';
import { Router } from '@angular/router';
import { MyTest } from './mytest';

@Component({
  selector: 'app-mytest',
  templateUrl: './mytest.component.html',
  styleUrls: ['./mytest.component.css']
})
export class MytestComponent implements OnInit {

  test:Observable<MyTest[]>;
  constructor(private service:MytestService,private router:Router) { 
  
  }

  ngOnInit(): void {
    this.reloadData();
  }
reloadData()
{
  this.test=this.service.getTestList();
}
deleteTest(id:number)
{
  this.service.removeTest(id).subscribe(
    data=>{
      console.log(data);
      this.reloadData();},
      error=>console.log(error));  
}

updateTest(id:number)
{
  this.router.navigate(['update',id]);
}
//testDetail(id:number)
//{
//  this.router.navigate(['detail',id]);
//}

}
