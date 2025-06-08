import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../model/product';
import { Observable } from 'rxjs/internal/Observable';
import { ProductV2 } from '../model/product-v2';

@Injectable({
  providedIn: 'root'
})
export class ProductV2Service {

  serverUrl: string = "https://dummyjson.com/products";
  httpClient!: HttpClient;



  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  //CRUD Ops
  // List all products.

  getAllProducts = (): Observable<ProductV2[]> => {
    return this.httpClient.get<ProductV2[]>(this.serverUrl);
  }

  // fetching a single product
  getProduct = (id: number): Observable<ProductV2> => {   
    return this.httpClient.get<ProductV2>(`${this.serverUrl}/${id}`);
  }

}
