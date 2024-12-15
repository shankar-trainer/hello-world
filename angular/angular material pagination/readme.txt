Step 1: Set Up the Backend with Express.js and MySQL
Let’s start by setting up an Express.js server to handle API requests. We’ll query data from a MySQL database and provide paginated results to our Angular frontend.

1.1. Install the Required Dependencies
mkdir pagination-backend
cd pagination-backend
npm init -y
npm install express mysql2 cors body-parser
1.2. Create the Express Server (index.js)
const express = require('express');
const mysql = require('mysql2');
const cors = require('cors');
const app = express();
const port = 3000;
// Middleware
app.use(cors());
app.use(express.json());
// MySQL connection
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'password',
  database: 'pagination_demo'
});
connection.connect((err) => {
  if (err) {
    console.error('Database connection failed:', err.stack);
    return;
  }
  console.log('Connected to MySQL');
});
// API to fetch paginated data
app.get('/items', (req, res) => {
  const page = parseInt(req.query.page) || 1;
  const limit = parseInt(req.query.limit) || 10;
  const offset = (page - 1) * limit;
  connection.query(
    'SELECT SQL_CALC_FOUND_ROWS * FROM items LIMIT ?, ?', [offset, limit],
    (err, results) => {
      if (err) throw err;
      // Get the total number of records
      connection.query('SELECT FOUND_ROWS() AS total', (err, totalResults) => {
        if (err) throw err;
        res.json({
          total: totalResults[0].total,
          data: results
        });
      });
    }
  );
});
app.listen(port, () => {
  console.log(`Server running on http://localhost:${port}`);
});
In this setup:

We connect to a MySQL database named pagination_demo.

The /items endpoint returns paginated results using the LIMIT and OFFSET SQL clauses.

The SQL_CALC_FOUND_ROWS clause calculates the total number of records.

1.3. Database Setup (MySQL)
To create the MySQL table and insert dummy data, run the following SQL script:

CREATE DATABASE pagination_demo;
USE pagination_demo;
CREATE TABLE items (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);
-- Insert some dummy data
INSERT INTO items (name)
VALUES ('Item 1'), ('Item 2'), ('Item 3'),('Item 100');
Step 2: Setting Up the Frontend in Angular 17
Next, we’ll create the Angular frontend to display the paginated data.

2.1. Create a New Angular Project
ng new pagination-frontend
cd pagination-frontend
2.2. Install Angular Material
ng add @angular/material
Choose the theme of your preference and include animations when prompted.

app.config.ts

import { ApplicationConfig, importProvidersFrom } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { HttpClientModule } from '@angular/common/http';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatTableModule } from '@angular/material/table';
import {DragDropModule} from '@angular/cdk/drag-drop';

export const appConfig: ApplicationConfig = {
  providers: [provideRouter(routes), provideAnimationsAsync(),
    importProvidersFrom(HttpClientModule),
    importProvidersFrom(MatPaginatorModule),
    importProvidersFrom(MatTableModule),
    importProvidersFrom(DragDropModule),
  ]
};

2.4. Create a Service to Fetch Data
Create a service to call the Express API. Run the following command:

ng generate service services/item

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ItemService {
  private apiUrl = 'http://localhost:3000/items';
  constructor(private http: HttpClient) {}
  getItems(page: number, limit: number): Observable<any> {
    return this.http.get(`${this.apiUrl}?page=${page}&limit=${limit}`);
  }
}

2.5. Create the Component for Pagination
Run the following command to create a component:

ng generate component components/item-list
In src/app/components/item-list/item-list.component.ts, add the following logic to handle pagination:


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
In src/app/components/item-list/item-list.component.html, add the following code:

<p>item-list works!</p>
<div class="container">
    <table mat-table #table [dataSource]="items" class="mat-elevation-z8">
      <ng-container matColumnDef="id">
        <th mat-header-cell *matHeaderCellDef> ID </th>
        <td mat-cell *matCellDef="let element"> {{element.id}} </td>
      </ng-container>
      <ng-container matColumnDef="name">
        <th mat-header-cell *matHeaderCellDef> Name </th>
        <td mat-cell *matCellDef="let element"> {{element.name}} </td>
      </ng-container>
      <tr mat-header-row *matHeaderRowDef="displayedColumns"></tr>
      <tr mat-row *matRowDef="let row; columns: displayedColumns;"></tr>
    </table>
    <mat-paginator [length]="totalItems"
                   [pageSize]="pageSize"
                   [pageSizeOptions]="[5, 10, 25, 50]"
                   (page)="onPageChange($event)">
    </mat-paginator>
  </div>
app.component.ts
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import { ItemListComponent } from "./components/item-list/item-list.component";
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MatSlideToggleModule,
    MatFormFieldModule,
    MatInputModule, ItemListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'myapp2';
}
app.component.html
<app-item-list>

</app-item-list>

<router-outlet />



  Step 3: Running the Application
Start the backend server:

node index.js
Start the Angular frontend:

ng serve
Visit http://localhost:4200 to see the paginated data in action.

