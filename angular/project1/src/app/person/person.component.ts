import { Component, OnInit } from '@angular/core';
import { Person } from './person';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {

  //person:Person=new Person();
  personForm:FormGroup;
  personId:FormControl;
  personName:FormControl;
  personLocation:FormControl;

  login():void{

  }
  constructor(private builder:FormBuilder) {
    
    this.personId=new FormControl('',[Validators.required]);
    this.personName=new FormControl('',[Validators.required,Validators.minLength(10)]);
    this.personLocation=new FormControl('',[Validators.required,Validators.minLength(5)]);
    this.personForm=this.builder.group({personId:this.personId, 
      personName:this.personName,personLocation:this.personLocation});    
   }

  ngOnInit(): void {
  }

}
