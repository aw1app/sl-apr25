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
    this.product =new Product(1, "Motorola Zing", 12000.55, 'This is a elite mobile with awesome features.', true,
      'images/motorola.PNG');
  }

   f1 = ():void => {

    let x=10;

  }

}
