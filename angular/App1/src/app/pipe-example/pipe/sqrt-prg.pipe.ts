import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sqrtPrg'
})
export class SqrtPrgPipe implements PipeTransform {

  transform(value:number): unknown {
    var x=Math.sqrt(value);
    console.log('sqrt  of '+value +' is  '+Math.sqrt(value))
    console.log('sqrt  of '+value +' is  '+x)
    return x;
  }

}
