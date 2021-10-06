import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MytestComponent } from './mytest/mytest.component';
import { UpdateTestComponent } from './update-test/update-test.component';
import { CreateTestComponent } from './create-test/create-test.component';
import { TestDetailsComponent } from './test-details/test-details.component';

const routes: Routes = [
  {path:'',redirectTo:'test',pathMatch:'full'},
  {path:'mytest',component:MytestComponent},
  {path:'add',component:CreateTestComponent},
  {path:'update/:id',component:UpdateTestComponent},
  {path:'detail/:id',component:TestDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
