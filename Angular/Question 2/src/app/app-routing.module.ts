import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdvertisementFormComponent } from './advertisement-form/advertisement-form.component';
import { AdvertisementTableComponent } from './advertisement-table/advertisement-table.component';
import { EditProductComponent } from './edit-product/edit-product.component';

const routes: Routes = [
  {path:"",component:AdvertisementFormComponent},
  {path:"",component:AdvertisementTableComponent},
  {path:"Edit/:title",component:EditProductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }