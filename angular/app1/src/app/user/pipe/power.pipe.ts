import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'power',
  standalone: true
})
export class PowerPipe implements PipeTransform {

  transform(n:number, p:number):number {
    return Math.pow(n,p);
  }

}
