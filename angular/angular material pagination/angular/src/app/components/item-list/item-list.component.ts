import { Component, OnInit, ViewChild } from '@angular/core';
import { ItemService } from '../../services/item.service';
import { MatPaginator } from '@angular/material/paginator';
import { PageEvent } from '@angular/material/paginator';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
//import {MatFormFieldModule} from '@angular/material/form-field';
import { MatTableModule } from '@angular/material/table';
//import { MatSortModule } from '@angular/material/sort';


@Component({
  selector: 'app-item-list',
  standalone: true,
  imports: [CommonModule,FormsModule,MatTableModule,MatPaginator],
  templateUrl: './item-list.component.html',
  styleUrl: './item-list.component.css'
})
export class ItemListComponent {

  displayedColumns: string[] = ['id', 'name'];
  items = [];
  totalItems = 0;
  pageSize = 10;
  pageIndex = 0;
  @ViewChild(MatPaginator) paginator: MatPaginator;
  constructor(private itemService: ItemService) {
//   this.paginator=null;

  }
  ngOnInit(): void {
    this.getItems();
  }
  getItems(): void {
    this.itemService.getItems(this.pageIndex + 1, this.pageSize)
      .subscribe((response) => {
        this.items = response.data;
        this.totalItems = response.total;
      });
  }
  onPageChange(event: PageEvent): void {
    this.pageIndex = event.pageIndex;
    this.pageSize = event.pageSize;
    this.getItems();
  }

}
