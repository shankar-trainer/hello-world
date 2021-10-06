import { Component, OnInit } from '@angular/core';
import { MyTest } from '../mytest/mytest';
import { ActivatedRoute, Router } from '@angular/router';
import { MytestService } from '../mytest.service';

@Component({
  selector: 'app-update-test',
  templateUrl: './update-test.component.html',
  styleUrls: ['./update-test.component.css']
})
export class UpdateTestComponent implements OnInit {
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
  updateTest()
  {
    this.service.updateTest(this.test).subscribe(
      data=>console.log(data),
      
      error=>console.log(error)
    );
    this.gotoList();

  }

  onSubmit(){
    
    console.log("on submit called")
    this.updateTest()
  }

  gotoList()
  {
  this.router.navigate(['/mytest'])
  
  }


}
