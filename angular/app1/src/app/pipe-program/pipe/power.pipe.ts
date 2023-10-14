import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'power'
})
export class PowerPipe implements PipeTransform {

  transform(n1: number, n2: number): unknown {
    return Math.pow(n1, n2);
  }

}
