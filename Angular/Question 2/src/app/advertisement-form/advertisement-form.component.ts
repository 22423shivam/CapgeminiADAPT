import { AstMemoryEfficientTransformer } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
// import { format } from 'path';
import { DataService } from '../data-service.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-advertisement-form',
  templateUrl: './advertisement-form.component.html',
  styleUrls: ['./advertisement-form.component.css']
})
export class AdvertisementFormComponent implements OnInit {

  category1 = ["Furniture","Hardware","Mobile"];
  name1 = "Akshat";

  constructor(private _dataService:DataService) {
    //this.a = _dataService.initializee();
   }

  a:any;  

  ngOnInit(): void {
    
  }

  storeData(advert:any){
    
    this._dataService.storeAdvertisement(advert);
    console.log(advert);
  }

  catHasError = true;

  catValidation(value:any){

    if(value==""){
      this.catHasError = true;
    }
    else{
      this.catHasError = false;
    }

  }


}