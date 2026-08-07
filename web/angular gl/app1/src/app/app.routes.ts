import { Routes } from '@angular/router';
import { Book } from './book/book';
import { Employee } from './employee/employee';
import { Calculator } from './calculator/calculator';
import { Customer } from './customer/customer';
import { ReactiveForm } from './reactive-form/reactive-form';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';

export const routes: Routes = [
    {
        path: '', component: Book
    },
    {
        path: 'book', component: Book
    },
    {
        path: 'employee', component: Employee
    },
    {
        path: 'calculator', component: Calculator
    },
    {
        path: 'customer', component: Customer
    },
    {
        path: 'reactiveform', component: ReactiveForm
    },
    {
        path: 'templateform', component: TemplatedrivenComponent
    },

];
