import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'expPipe'
})
export class ExpPipePipe implements PipeTransform {

  transform(n1: number,n2:number): unknown {
    return Math.pow(n1,n2);
  }

}
