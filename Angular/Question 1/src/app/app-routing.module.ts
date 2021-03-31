import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {AdminComponent} from './admin/admin.component';
import {MenuComponent} from './menu/menu.component';
import {UserComponent} from './user/user.component';
import {RestaurantComponent} from './restaurant/restaurant.component';
import { AddFormComponent } from './add-form/add-form.component';
import { DeleteFormComponent } from './delete-form/delete-form.component';
import { EditFormComponent } from './edit-form/edit-form.component';

const routes: Routes = [
  {path:'admin',component:AdminComponent},
  {path:'menu',component:MenuComponent},
  {path:'user',component:UserComponent},
  {path:'restaurant/:id',component:RestaurantComponent},
  {path: 'form', component: AddFormComponent},
  {path: 'formDelete', component: DeleteFormComponent},
  {path: 'formEdit', component: EditFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[
  AdminComponent,
  MenuComponent,
  UserComponent,
  RestaurantComponent,
  AddFormComponent,
  DeleteFormComponent,
  EditFormComponent
];