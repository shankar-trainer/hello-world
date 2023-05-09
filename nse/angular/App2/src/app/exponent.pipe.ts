import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'exponent'
})
export class ExponentPipe implements PipeTransform {

  transform(n1: number, n2:number): unknown {
    return Math.pow(n1,n2);
  }

}
