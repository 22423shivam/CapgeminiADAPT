import { Component, OnInit } from '@angular/core';
import { DataService } from '../data-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-advertisement-table',
  templateUrl: './advertisement-table.component.html',
  styleUrls: ['./advertisement-table.component.css']
})
export class AdvertisementTableComponent implements OnInit {

  constructor(private _dataService:DataService, private route:Router) { }

  adData:any = [];
  keyword: string = "";

  ngOnInit(): void {
    this.adData = this._dataService.getAdvertisements();
  }

  toEdit(title:any){
    this.route.navigate(['/Edit',title]);
  }

  toDelete(title:any){
    console.log(title);
    this._dataService.deleteAdvertisement(title);
  }

}