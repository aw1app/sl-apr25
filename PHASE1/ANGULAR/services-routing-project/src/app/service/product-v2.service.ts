import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { ProductV2 } from '../model/product-v2';

@Injectable({
  providedIn: 'root'
})
export class ProductV2Service {

  private serverUrl: string = "http://localhost:3000/products";

  private productsSubject = new BehaviorSubject<ProductV2[]>([]);
  products$ = this.productsSubject.asObservable(); // exposed observable

  constructor(private httpClient: HttpClient) {
    // Initial load of products
    this.loadProducts();
  }

  // Load all products and update the subject
  loadProducts(): void {
    this.getAllProducts().subscribe(
      response => this.productsSubject.next(response),
      error => console.error('Error loading products:', error)
    );
  }

  // Get all products (returns Observable)
  getAllProducts(): Observable<ProductV2[]> {
    return this.httpClient.get<ProductV2[]>(this.serverUrl);
  }

  // Fetch a single product
  getProduct(id: number): Observable<ProductV2> {
    return this.httpClient.get<ProductV2>(`${this.serverUrl}/${id}`);
  }

  // Add a new product
  addProduct(prod: ProductV2): void {
    this.httpClient.post<ProductV2>(this.serverUrl, prod).subscribe(() => {
      this.loadProducts(); // Refresh list after adding
    });
  }

  // Delete a product
  deleteProduct(id: number): void {
    this.httpClient.delete(`${this.serverUrl}/${id}`).subscribe(() => {
      this.loadProducts(); // Refresh list after deletion
    });
  }

}
