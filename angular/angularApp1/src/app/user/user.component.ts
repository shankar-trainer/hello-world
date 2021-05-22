import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

@Input()  id:number;
@Input()  name:string;
@Input()  salary:number;
@Input()  location:string;
@Input() country:string;
  
constructor(){
   this.id=0 ;
   this.name='';
   this.salary=0;
   this.location='';
   this.country='';
  }

  submit(){
    alert('id '+this.id+'\nname'+this.name+'\nsalary'+this.salary+'\nlocation'+this.location+'\ncountry'+this.country)
  }
  ngOnInit(): void {
  }

}
