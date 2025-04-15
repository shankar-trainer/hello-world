import { Component, Input } from '@angular/core';
import { Insurance } from './model/insurance';
import { insurancedata } from './data/insurance_data';
import { CommonModule } from '@angular/common';
import { PowerPipe } from './power.pipe';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-pipe-example',
  imports: [CommonModule,FormsModule,PowerPipe],
  templateUrl: './pipe-example.component.html',
  styleUrl: './pipe-example.component.css'
})
export class PipeExampleComponent {
  @Input() base:number=0;
  @Input() exponent:number=0;

  insurance:Insurance[];
  constructor(){
    this.insurance=insurancedata;
  }
  
  user={
    "userId":1,
    "userName":"parshant kumar",
    "dob":"1998-12-25",
    "address":{
         "city":"kochi",
         "location":"kakknad",
         "state":"kerala"
    }
 }
}
