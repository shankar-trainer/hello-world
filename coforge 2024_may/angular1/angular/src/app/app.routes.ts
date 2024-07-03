import { Routes } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { CustomerComponent } from './customer/customer.component';
import { EmployeeComponent } from './employee/employee.component';
import { PersonComponent } from './person/person.component';
import { PersonAppComponent } from './person-app/person-app.component';
import { TemplateFormComponent } from './template-form/template-form.component';
import { AddpersonComponent } from './addperson/addperson.component';

export const routes: Routes = [

    {
        path: '', component: CalculatorComponent
    },

    {
        path: 'calculator', component: CalculatorComponent
    },

    {
        path: 'customer', component: CustomerComponent
    },

    {
        path: 'person', component: PersonComponent
    },
    {
        path: 'person-all-data', component: PersonAppComponent
    },
    {
        path: 'template', component: TemplateFormComponent
    },
    {
        path: 'employee', component: EmployeeComponent
    },
    {
        path: 'addperson', component: AddpersonComponent
    }

];
