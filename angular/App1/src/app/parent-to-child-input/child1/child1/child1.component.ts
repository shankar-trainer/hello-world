import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component {
  cname:any;
  @Input('name')
  setdata(name:any){
    this.cname=name;
  }
}
