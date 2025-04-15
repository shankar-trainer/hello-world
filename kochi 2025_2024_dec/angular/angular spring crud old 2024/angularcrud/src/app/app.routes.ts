import { Routes } from '@angular/router';
import { ShowallpersonComponent } from './showallperson/showallperson.component';
import { AddpersonComponent } from './addperson/addperson.component';

export const routes: Routes = [
 {path:'',component:ShowallpersonComponent},
 {path:'all',component:ShowallpersonComponent},
 {path:'add',component:AddpersonComponent},

];
