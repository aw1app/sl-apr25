import { Injectable } from '@angular/core';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products!:Product[];

  constructor() { 
    this.products = [

      new Product(1, "Samsung Mobile", 2000.5, 'This is a great mobile with awesome features.', true,
        'https://via.placeholder.com/300x200.png?text=Product+Image'),

      new Product(1, "Nokia 3233", 2400.5, 'This is a great value mobile with awesome features.', true,
        'https://via.placeholder.com/300x200.png?text=Product+Image'),

      new Product(1, "Samsung Flip", 2700.5, 'This is a great mobile with flip features.', true,
        'https://via.placeholder.com/300x200.png?text=Product+Image'),

      new Product(1, "Motorola Zing", 12000.55, 'This is a elite mobile with awesome features.', true,
        'images/motorola.PNG')
    ]

  }
}
