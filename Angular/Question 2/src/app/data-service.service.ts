import { Injectable, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService{

  advertisements:any = [];
  isHome:boolean = true;

  a= this.http.get("/assets/dummy.json").subscribe((data) =>{
    for(let a of <any>data){
      this.advertisements.push(a);
    }
    //console.log(data);
    return 0;
  });

  // initializee():any{
  //   this.http.get("/assets/dummy.json").subscribe((data) =>{
  //     for(let a of <any>data){
  //       this.advertisements.push(a);
  //     }
  //     //console.log(data);
  //     return 0;
  //   });
  // }

  constructor(private route:Router,private http:HttpClient) { }

  storeAdvertisement(advert:any){
    this.advertisements.push(advert);
    console.log(this.advertisements);
  }

  getAdvertisements(){
    return this.advertisements;
  }

  deleteAdvertisement(title:any){
    for(let i=0;i<this.advertisements.length;i++){
      if(this.advertisements[i].title==title){
        this.advertisements.splice(i,1);
      }
    }
  }

  getAd(title:any){
    for(let ad of this.advertisements){
      if(ad.title==title){
        return ad;
      }
    }
  }

  updateAd(oldTitle:any,newAd:any){

    for(let i=0;i<this.advertisements.length;i++){
      if(this.advertisements[i].title==oldTitle){
        this.advertisements[i] = newAd;
        break;
      }
    }
    alert("Data Updated");
    this.route.navigate(['']);
  }

}