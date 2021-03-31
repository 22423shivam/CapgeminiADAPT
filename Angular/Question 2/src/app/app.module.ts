import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdvertisementFormComponent } from './advertisement-form/advertisement-form.component';
import { FormsModule } from '@angular/forms';
import { DataService } from './data-service.service';
import { AdvertisementTableComponent } from './advertisement-table/advertisement-table.component';
import { EditProductComponent } from './edit-product/edit-product.component';
import { SearchfilterPipe } from './searchfilter.pipe';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AdvertisementFormComponent,
    AdvertisementTableComponent,
    EditProductComponent,
    SearchfilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }