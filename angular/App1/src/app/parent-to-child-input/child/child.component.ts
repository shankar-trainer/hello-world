import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child-input',
  template: `
      Say {{ childMessage }}
  `,
})

export class ChildComponent {

  @Input() childMessage: string='';

  constructor() { }

}
