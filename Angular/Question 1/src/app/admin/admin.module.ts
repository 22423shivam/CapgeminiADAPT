import { NgModule } from '@angular/core';

import {MatGridListModule} from '@angular/material/grid-list';

const AdminComponents=[
  MatGridListModule
]

@NgModule({
  imports: [AdminComponents],
  exports:[AdminComponents]
})
export class AdminModule { }