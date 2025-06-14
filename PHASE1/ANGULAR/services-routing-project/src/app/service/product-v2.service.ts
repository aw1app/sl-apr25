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

  products:ProductV2[] = []; 

  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;

    this.getAllProducts().subscribe(  response => { this.products = response.products }, error => { console.log(error)}  );
  }

  //CRUD Ops
  // List all products.

  getAllProducts = (): Observable<any> => {
    return this.httpClient.get<ProductV2[]>(this.serverUrl);
  }

  // fetching a single product
  getProduct = (id: number): Observable<ProductV2> => {   
    return this.httpClient.get<ProductV2>(`${this.serverUrl}/${id}`);
  }

  // adding a product
  addProduct = (prod:ProductV2):void => {
    
    this.products.push(prod);

    console.log("INSIDE ProductV2Service addProduct. Successfully created product! ");
    console.log("INSIDE ProductV2Service addProduct. this.products.length = " +this.products.length );
  }

  

}
