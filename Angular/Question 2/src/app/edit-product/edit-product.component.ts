import { Component, OnInit } from '@angular/core';
import { DataService } from '../data-service.service';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  constructor(private _dataService:DataService, private route:Router, private route2:ActivatedRoute) { }

  product:any = {};
  title:any = "";
  category = ["Furniture","Hardware","Mobile"];

  ngOnInit(): void {
    this.title = this.route2.snapshot.paramMap.get('title');
    this.product = this._dataService.getAd(this.title);

  }

  updateAd(oldTitle:any,newAd:any){
    this._dataService.updateAd(oldTitle,newAd);
  }

  cancel(){
    this.route.navigate(['']);
  }

}