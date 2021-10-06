import { Component, OnInit } from '@angular/core';
import { MyTest } from '../mytest/mytest';
import { MytestService } from '../mytest.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-test',
  templateUrl: './create-test.component.html',
  styleUrls: ['./create-test.component.css']
})
export class CreateTestComponent implements OnInit {
 test:MyTest=new MyTest();
 
  submitted=false;
  constructor(private service:MytestService,private router:Router) { }


  ngOnInit(): void {
  }

  newTest():void{
    this.submitted=false;
    this.test=new MyTest();
  }

  onSubmit()
  {
    console.log('on submit called');
    this.submitted=true;
    this.save();
  }
  save()
  {
    console.log('save called');
    
    this.service.saveTest(this.test).subscribe(
      data=>console.log(data),error=>console.log(error));
      this.test=new MyTest();
      this.gotoList();
    
    }
    gotoList()
    {
      this.router.navigate(['/mytest']);
    }
  

}
