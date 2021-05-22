import { Component, OnInit, ViewChild, AfterViewInit } from '@angular/core';

@Component({
  selector: 'app-changecase',
  templateUrl: './changecase.component.html',
  styleUrls: ['./changecase.component.css']
})
export class ChangecaseComponent implements OnInit, AfterViewInit {

   ucase:string='';
   lcase:string='';
   @ViewChild('input') inputBox:any; 

     textInput(event:any){
       this.ucase=event.target.value.toUpperCase();
       this.lcase=event.target.value.toLowerCase();
    }
    
  constructor() { }

  ngOnInit(): void {
      console.log('instance created')
    }
    ngAfterViewInit(){
      console.log('after view ...')
  //this.inputBox.nativeElement.focus();
}
}
