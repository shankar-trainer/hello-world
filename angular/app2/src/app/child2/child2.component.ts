import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrls: ['./child2.component.css']
})
export class Child2Component {
  cname:any;
  @Input('name')
  
  setdata(name:any){
    this.cname=name;
  }
}
