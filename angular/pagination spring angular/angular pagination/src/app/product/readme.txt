Implementing pagination between a Spring Boot backend and an Angular frontend involves both server-side and client-side logic.
Spring Boot (Backend) Implementation:
Controller Endpoint: Create a REST endpoint that accepts Pageable as a parameter. Spring Data JPA automatically binds page, size, and sort query parameters to this object.
Java

    @RestController
    @RequestMapping("/api/items")
    public class ItemController {

        @Autowired
        private ItemService itemService;

        @GetMapping
        public Page<Item> getAllItems(Pageable pageable) {
            return itemService.findAll(pageable);
        }
    }
Service Layer: In your service, pass the Pageable object to your repository method.
Java

    @Service
    public class ItemService {

        @Autowired
        private ItemRepository itemRepository;

        public Page<Item> findAll(Pageable pageable) {
            return itemRepository.findAll(pageable);
        }
    }
Repository Layer: If your repository extends JpaRepository, you can directly use its findAll(Pageable pageable) method.
Java

    public interface ItemRepository extends JpaRepository<Item, Long> {
    }
Angular (Frontend) Implementation:
Service: Create an Angular service to make HTTP requests to your Spring Boot API. Pass the page and size parameters.
TypeScript

    import { Injectable } from '@angular/core';
    import { HttpClient, HttpParams } from '@angular/common/http';
    import { Observable } from 'rxjs';

    @Injectable({
      providedIn: 'root'
    })
    export class ItemService {
      private baseUrl = 'http://localhost:8080/api/items';

      constructor(private http: HttpClient) { }

      getItems(page: number, size: number): Observable<any> {
        let params = new HttpParams()
          .set('page', page.toString())
          .set('size', size.toString());
        return this.http.get<any>(this.baseUrl, { params });
      }
    }
Component: In your component, inject the service and call the getItems method, updating the page and size as needed, typically in response to user interaction with pagination controls.
TypeScript

    import { Component, OnInit } from '@angular/core';
    import { ItemService } from '../item.service';

    @Component({
      selector: 'app-item-list',
      templateUrl: './item-list.component.html',
      styleUrls: ['./item-list.component.css']
    })
    export class ItemListComponent implements OnInit {
      items: any[] = [];
      currentPage = 0;
      pageSize = 5;
      totalPages = 0;
      totalElements = 0;

      constructor(private itemService: ItemService) { }

      ngOnInit(): void {
        this.loadItems();
      }

      loadItems(): void {
        this.itemService.getItems(this.currentPage, this.pageSize).subscribe(data => {
          this.items = data.content;
          this.totalPages = data.totalPages;
          this.totalElements = data.totalElements;
        });
      }

      onPageChange(page: number): void {
        this.currentPage = page;
        this.loadItems();
      }
    }
Template: Display the items and implement pagination controls (e.g., using ngx-pagination or custom controls) to call the onPageChange method in your component.
Code

    <div>
      <div *ngFor="let item of items">
        {{ item.name }}
      </div>

      <button (click)="onPageChange(currentPage - 1)" [disabled]="currentPage === 0">Previous</button>
      <span>Page {{ currentPage + 1 }} of {{ totalPages }}</span>
      <button (click)="onPageChange(currentPage + 1)" [disabled]="currentPage === totalPages - 1">Next</button>
    </div>

======================== medium ====
Angular Spring Boot pagination Component
Ahmed Gouiaa
Ahmed Gouiaa

Follow
7 min read
·
Aug 29, 2023
15




During my summer internship, I encountered a challenge related to implementing Spring Boot pagination within an Angular application. To streamline the process and adhere to Angular’s best practices for efficient code, I developed a customizable component named ‘my-paginator’. This component is designed with @Input and @Output variables, allowing it to be easily integrated into any component within the project.

Brief Explanation of Pagination in Spring Boot
Pagination in Spring Boot involves breaking down a large set of data into smaller, manageable portions, or pages. This prevents overwhelming users with all data at once. By specifying page size and number, users can navigate through data sections efficiently. Spring Boot’s pagination simplifies data retrieval, enhances performance, and offers a user-friendly browsing experience.

This is an example JSON object representing a list of devices:

{
    "content": [
        {
            "deviceId": 2,
            "label": "deviceA",
            "model": "SAMSUNG",
            "latitude": "41.902782",
            "alarms": [],
            "credential": {
                "id": 2,
                "username": "ahmed",
                "password": "pagiantorapp",
                "accessLevel": "admin",
                "expirationDate": "2023-08-10T20:53:21.537+00:00"
            },
            "longitude": "12.496366"
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "unsorted": true,
            "sorted": false
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 1,
        "unpaged": false,
        "paged": true
    },
    "last": false,
    "totalPages": 13,
    "totalElements": 13,
    "size": 1,
    "number": 0,
    "sort": {
        "empty": true,
        "unsorted": true,
        "sorted": false
    },
    "numberOfElements": 1,
    "first": true,
    "empty": false
}
content: An array containing the actual data objects (devices) for the current page. It includes attributes like deviceId, label, model, latitude, alarms, credential, and longitude.
pageable: Information about the current pagination state, such as sorting status, offset, page number, and page size.
last: Indicates whether this is the last page of the data set.
totalPages: The total number of pages required to display all the data based on the defined page size.
totalElements: The total number of data elements available in the entire data set.
size: The number of data elements in the current page.
number: The current page number (0-based index).
sort: Sorting information for the data.
numberOfElements: The number of data elements in the current page.
first: Indicates whether this is the first page of the data set.
empty: Indicates whether the content of the current page is empty.
Let’s start coding :
first we are going to create our component “my-paginator” , this component creates a navigation bar with “Previous” and “Next” buttons for moving between pages, displays page number buttons that change appearance based on the current page, and includes a dropdown to select the number of items shown per page. The Angular methods like previousOffset(), setCurrentPage(currentIndex), and nextOffset() handle the navigation logic .

Get Ahmed Gouiaa’s stories in your inbox
Join Medium for free to get updates from this writer.

Enter your email
Subscribe
my-paginator.html :

<nav aria-label="Page navigation example" class="flex justify-center  ">
  <ul class="inline-flex -space-x-px text-base ">
    <li>
      <a (click)="previousOffset()" [ngClass]="{ disabled: currentPageIndex === 0 }"
        class="rounded my-2  mr-1 flex items-center justify-center px-4 h-10 ml-0 leading-tight text-gray-500 bg-white border border-gray-300 hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white">
        Previous
      </a>
    </li>

    <div *ngFor="let page of pages; let currentIndex = index">
      <li>
        <a
        [ngClass]="{ 'text-white': currentIndex === currentPageIndex, 'text-red-500': currentIndex !== currentPageIndex }"
         [attr.aria-current]="
      currentIndex === currentPageIndex
    " (click)="setCurrentPage(currentIndex)"
          class=" rounded my-2  mx-0.5  flex items-center justify-center px-3 h-10 leading-tight text-gray-500 bg-white border border-gray-300 hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white">
          {{ pages[currentIndex] }}
        </a>
      </li>
    </div>

    <li>
      <a (click)="nextOffset()" [ngClass]="{ disabled: currentPageIndex === pages?.length! - 1 }"
        class=" rounded my-2 mx-1  flex items-center justify-center px-4 h-10 leading-tight text-gray-500 bg-white border border-gray-300 hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white">
        Next
      </a>
    </li>
    <li>
      <div class="relative rounded my-2 mx-1   ">
        <select #mySelect [(ngModel)]="selectedItem" (ngModelChange)="onItemsPerPageChange()"
          class=" text-center block appearance-none w-full  h-10 border border-gray-300 bg-white text-gray-700 rounded leading-tight focus:outline-none focus:shadow-outline">
           <option>2</option>
          <option>4</option>
          <option>8</option>
        </select>
        <div class="pointer-events-none absolute inset-y-0 right-0 flex items-center px-2 text-gray-700">

        </div>
      </div>
    </li>
  </ul>
</nav>
now we are going to implement the “ my-paginator.ts” file

The class “”MyPaginatorComponent” properties include:
currentPageIndex: Input property to track the current page index.
pageSize: Input property to define the number of items per page.
total_pages: Input property to hold the total number of pages.
pages: Input property containing a list of page numbers.
selectedItem: Holds the value of the selected item in the items per page dropdown.
selectedItemChange: An output event emitter to signal changes in the selected item.
changeCurrentIndex: An output event emitter to signal changes in the current page index.
2. Methods:

previousOffset(): Decrements the currentPageIndex if it's greater than 0, emits the updated index using changeCurrentIndex.
nextOffset(): Increments the currentPageIndex if it's less than the last index, emits the updated index using changeCurrentIndex.
onItemsPerPageChange(): Resets the currentPageIndex to 0, emits the selected item value, emits the updated index, logs the selected item, and updates pageSize.
setCurrentPage(index): Sets the currentPageIndex to the provided index and emits the updated index.
generateNumberList(num): Generates a list of numbers from 1 to the provided number.
my-paginator.ts
import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-my-paginator',
  templateUrl: './my-paginator.component.html',
  styleUrls: ['./my-paginator.component.css'],
})
export class MyPaginatorComponent {
  // all required variables
  // 2- current page number
  @Input() currentPageIndex = 0;
  // 3- page size
  @Input() pageSize: number = 1;
  // 4- number of pages
  @Input() total_pages!: number;
  // 5- pages list
  @Input() pages: any;
  // 6- selected item
  selectedItem: any;

  @Output() selectedItemChange = new EventEmitter<number>();
  @Output() changeCurrentIndex = new EventEmitter<number>();

  constructor() {}

  // on previous button click
  previousOffset() {
    if (this.currentPageIndex > 0) this.currentPageIndex--;
    this.changeCurrentIndex.emit(this.currentPageIndex);
  } // on next button click
  nextOffset() {
    if (this.currentPageIndex < this.pages.length! - 1) this.currentPageIndex++;
    this.changeCurrentIndex.emit(this.currentPageIndex);
  }
  // on page size select input  change
  onItemsPerPageChange(): void {
    this.currentPageIndex = 0;
    this.selectedItemChange.emit(this.selectedItem);
    this.changeCurrentIndex.emit(0);
    console.log(this.selectedItem);
    this.pageSize = this.selectedItem;
  }

  // on one of page number [1,2,3,4] change
  setCurrentPage(index: number): void {
    this.currentPageIndex = index;
    this.changeCurrentIndex.emit(index);
  } // function to generate number list from numeric value
  generateNumberList(num: number): number[] {
    const numberList: number[] = [];
    for (let i = 1; i <= num; i++) {
      numberList.push(i);
    }
    return numberList;
  }
}
Now we are going to call this component from the componenet displaying my list of devices in my case :


<app-my-paginator [currentPageIndex]="currentPageIndex" [pageSize]="pageSize" [pages]="pages"
      (selectedItemChange)="onSelectedItemChange($event)"
      (changeCurrentIndex)="setCurrentPage($event)">
</app-my-paginator>
the whole html file “list-devices.html”:

<div class="container">
  <!-- device-list.component.html -->
  <ng-container *ngIf="devices.length != 0; else noDevices">
    <div class="p-4">
      <h1 class="text-2xl  mb-4">List of Devices</h1>
      <ul>
        <li *ngFor="let device of devices" class="bg-white shadow-md rounded-lg p-4 mb-4">
          <div class="flex items-center">
            <div class="mr-4">
              <i class="fas fa-mobile-alt text-blue-500 text-2xl"></i>
            </div>
            <div>
              <h2 class="text-lg ">{{ device.model }}</h2>
              <p class="text-gray-600">{{ device.latitude }}, {{ device.longitude }}</p>
            </div>
          </div>
        </li>
      </ul>
    </div>
    <app-my-paginator [currentPageIndex]="currentPageIndex" [pageSize]="pageSize" [pages]="pages"
      (selectedItemChange)="onSelectedItemChange($event)"
      (changeCurrentIndex)="setCurrentPage($event)"></app-my-paginator>
  </ng-container>
</div>
<ng-template #noDevices>
  <div class="mx-auto mt-8 text-center text-gray-500">
    <p class="mb-4 text-xl ">No devices are matching.</p>
    <div class="text-center">
      <img src="../../../../../assets/images/NOTFOUND.png" alt="" class="mx-auto" />
    </div>
    <button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
      <a href="/client/devices"> add device</a>
    </button>
  </div>
</ng-template>
list-devices.ts :

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DevicesServices } from '../services/Devices.service';

@Component({
  selector: 'app-my-devices-list',
  templateUrl: './my-devices-list.component.html',
  styleUrls: ['./my-devices-list.component.css'],
})
export class MyDevicesListComponent implements OnInit {
  devices: any;
  pageSize: number = 1;
  currentPageIndex = 0;
  pages: any;
  total_pages!: number;
  selectedItem: any;
  modelsList: string[] = ['HUAWEI', 'SAMSUNG', 'IPHONE', 'XIAOMI', 'OPPO'];

  constructor(private serviceDevice: DevicesServices) {}

  // Generates an array of numbers from 1 to 'num'
  generateNumberList(num: number): number[] {
    const numberList: number[] = [];
    for (let i = 1; i <= num; i++) {
      numberList.push(i);
    }
    return numberList;
  }

  // Initialization method executed when the component is loaded
  ngOnInit(): void {
    console.log('im in this.ngOnInit()');
    // Load devices list with initial settings
    this.reloadDevicesList(this.currentPageIndex, this.pageSize, true);
  }

  // Triggered when the selected item in the page size dropdown changes
  onSelectedItemChange(newSelectedItem: any) {
    console.log('im in onSelectedItemChange()');

    // Update page size and reload devices list
    this.pageSize = newSelectedItem;
    this.reloadDevicesList(this.currentPageIndex, this.pageSize, true);
    console.log('pagesize' + this.pageSize);
  }

  // Sets the current page index and reloads devices list accordingly
  setCurrentPage(index: number): void {
    this.currentPageIndex = index;
    this.reloadDevicesList(this.currentPageIndex, this.pageSize, false);
    console.log('pagesize' + this.pageSize);
  }

  // Reloads the list of devices with given offset and page size
  reloadDevicesList(offset: number, pageSize: number, editPages: boolean) {
    if (!editPages) {
      console.log('im in reloadDevicesList()');
      // Load devices for the specified offset and page size
      this.serviceDevice
        .getAllDevices(offset, pageSize)
        .subscribe((res: any) => {
          this.devices = res.content;
        });
    } else {
      console.log('im in reloadDevicesList()');
      // Load devices for the current page index and page size,
      // along with updating pagination data
      this.serviceDevice
        .getAllDevices(this.currentPageIndex, this.pageSize)
        .subscribe((res: any) => {
           this.devices = res.content;
          this.total_pages = res.totalPages;
          this.pages = this.generateNumberList(this.total_pages);
        });
    }
  }
}
the ngOnInit() method:

It initializes the component, logging a message.
Calls reloadDevicesList() to load devices on initialization.
onSelectedItemChange(newSelectedItem: any):

Updates pageSize based on the selected item.
Calls reloadDevicesList() to update the device list with the new page size.
setCurrentPage(index: number):

Updates currentPageIndex to the selected page index.
Calls reloadDevicesList() to update the device list for the selected page.
reloadDevicesList(offset: number, pageSize: number, editPages: boolean):

Fetches devices using the service based on the given offset and page size.
Updates devices, total_pages, and pages if editPages is true, which is used when initializing or changing page size.
Logs information about the execution
source code in github : https://github.com/ahmedg99/paginator-app/tree/main

Pagination
Angular
Spring Boot
====================

https://www.bezkoder.com/angular-17-pagination-ngx/
https://github.com/bezkoder/angular-17-pagination-example