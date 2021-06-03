import { Directive, ElementRef, Renderer2, HostListener } from '@angular/core';

@Directive({
  selector: '[appEmpDirective]'
})
export class EmpDirectiveDirective {

  constructor(private el:ElementRef, private renderer:Renderer2) {
    //renderer.setStyle(el.nativeElement,'background','yellow');
   }

   @HostListener('mousehover')
   onMouseHover(){
  let part=this.el.nativeElement.querySelector('.mytext')
  this.renderer.setStyle(this.el.nativeElement,'background','red');
   
}

}
