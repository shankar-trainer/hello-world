import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'exponent',
  standalone: true
})
export class ExponentPipe implements PipeTransform {

  transform(value: number,power:number): unknown {
    return Math.pow(value,power);
  }

}
