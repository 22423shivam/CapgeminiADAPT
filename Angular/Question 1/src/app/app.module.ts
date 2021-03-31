import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule,routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AdminModule } from './admin/admin.module';
import { MenuModule } from './menu/menu.module';
import { RestaurantModule } from './restaurant/restaurant.module';

import {MatGridListModule} from '@angular/material/grid-list';
import { AddFormComponent } from './add-form/add-form.component';
import { FormsModule } from '@angular/forms';
import { RestaurantService } from './restaurant.service';
import { DeleteFormComponent } from './delete-form/delete-form.component';
import { EditFormComponent } from './edit-form/edit-form.component';
import { AdminComponent } from './admin/admin.component';
import { MenuComponent } from './menu/menu.component';
import { RestaurantComponent } from './restaurant/restaurant.component';


@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    AddFormComponent,
    DeleteFormComponent,
    EditFormComponent,
    AdminComponent,
    MenuComponent,
    RestaurantComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    AdminModule,
    MenuModule,
    RestaurantModule,
    MatGridListModule,
    FormsModule
  ],
  providers: [RestaurantService],
  bootstrap: [AppComponent]
})
export class AppModule { }