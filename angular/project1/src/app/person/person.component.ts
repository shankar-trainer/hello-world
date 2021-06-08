import { Component, OnInit, OnChanges, OnDestroy, Input } from '@angular/core';
import { Person } from './person';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit, OnChanges, OnDestroy {
   counter:number;
  //person:Person=new Person();
  personForm:FormGroup;
  personId:FormControl;
  personName:FormControl;
  personLocation:FormControl;
  
  @Input() name:string;


  countIt(){
    this.counter++;
    }

  ngOnDestroy():void{
     console.log('destroy called ')
  }

  ngOnChanges():void{
     console.log('ng on changes works '+this.counter)  
  }

  login():void{

  }
  constructor(private builder:FormBuilder) {
    this.name='ram kumar';
    this.counter=0;
    this.personId=new FormControl('',[Validators.required]);
    this.personName=new FormControl('',[Validators.required,Validators.minLength(10)]);
    this.personLocation=new FormControl('',[Validators.required,Validators.minLength(5)]);
    this.personForm=this.builder.group({personId:this.personId, 
      personName:this.personName,personLocation:this.personLocation});    
   }

  ngOnInit(): void {
    console.log(' ng init works '+this.counter)
  }

}
