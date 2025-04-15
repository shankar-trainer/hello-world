import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'power'
})
export class PowerPipe implements PipeTransform {

  transform(base:number,exponent:number): unknown {
    return Math.pow(base,exponent);
  }

}
