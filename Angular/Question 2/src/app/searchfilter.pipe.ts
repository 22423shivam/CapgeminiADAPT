import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchfilter'
})
export class SearchfilterPipe implements PipeTransform {

  transform(ads: Array<any>, keyword: any): any {
    if(!ads || !keyword){
      return ads;
    }

    return ads.filter(ad => ad.title.toLowerCase().includes(keyword.toLowerCase()) || ad.name.toLowerCase().includes(keyword.toLowerCase()) );

  }

}