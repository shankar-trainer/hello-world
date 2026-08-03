import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'square',
})
export class SquarePipe implements PipeTransform {

  transform(value: number, exponent:number): number {
    return Math.pow(value,exponent);
  }

}
