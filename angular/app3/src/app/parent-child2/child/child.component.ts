import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-child11',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent11 {
  @Input() user?: any;

  constructor() { 
    
  }

  ngOnInit(): void {
  }
}
