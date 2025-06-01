import { Component } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'product',
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  product!: Product;

  constructor() {
    this.product = new Product(1, "Samsung Mobile", 2000.5, 
      'This is a great product with awesome features.',
      true,
      'https://via.placeholder.com/300x200.png?text=Product+Image');
  }

}
