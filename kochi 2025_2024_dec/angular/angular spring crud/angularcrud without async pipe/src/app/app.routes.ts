import { Routes } from '@angular/router';
import { ShowallpersonComponent } from './showallperson/showallperson.component';
import { AddpersonComponent } from './addperson/addperson.component';
import { SearchpersonComponent } from './searchperson/searchperson.component';
import { DeletepersonComponent } from './deleteperson/deleteperson.component';
import { UpdatepersonComponent } from './updateperson/updateperson.component';

export const routes: Routes = [
 {path:'',component:ShowallpersonComponent},
 {path:'all',component:ShowallpersonComponent},
 {path:'add',component:AddpersonComponent},
 {path:'search',component:SearchpersonComponent},
 {path:'delete',component:DeletepersonComponent},
 {path:'update',component:UpdatepersonComponent},


];
