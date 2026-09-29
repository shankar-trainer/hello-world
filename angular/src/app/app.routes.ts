import { Routes } from '@angular/router';
import { AddPersonComponent } from './add-person-component/add-person-component';
import { PersonCompoment } from './person-compoment/person-compoment';
import { Employee } from './employee/employee';

export const routes: Routes = [
    {
        path: '', component: AddPersonComponent
    },

    {
        path: 'addperson', component: AddPersonComponent
    },

    {
        path: 'showallperson', component: PersonCompoment
    },

    {
        path: 'employee', component: Employee
    },
];

