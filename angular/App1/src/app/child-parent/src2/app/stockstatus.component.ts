import { Component, Input, EventEmitter, Output, OnChanges } from '@angular/core';

@Component({
    selector: 'app-stock-status',
    template: `<input type='number' [(ngModel)]='updatedstockvalue'/> 
        <button class='btn btn-primary'
            [class]='class'
            (click)="stockValueChanged()">Change Stock Value</button>`
})

export class StockStatusComponent implements OnChanges {

    @Input() stock: number;
    @Input() productId: number;
    @Output() stockValueChange = new EventEmitter();
    class = '';
    updatedstockvalue: number;

    stockValueChanged() {
        this.stockValueChange.emit({ id: this.productId, updatdstockvalue: this.updatedstockvalue });
        this.updatedstockvalue = null;
    }

    ngOnChanges() {
        if (this.stock > 10) {
            this.class = 'btn btn-success';
        } else {
            this.class = 'btn btn-danger';
        }
    }

}