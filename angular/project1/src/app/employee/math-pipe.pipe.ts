import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'mathPipe'
})
export class MathPipePipe implements PipeTransform {

  transform(value: number,multiply:number): number {
    return value*multiply;
  }

}
