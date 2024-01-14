import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'exponent',
  standalone: true
})
export class ExponentPipe implements PipeTransform {

  transform(x:number,y:number): number {
    return  Math.pow(x,y);
  }

}
