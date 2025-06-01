import { Component } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'product',
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  prod!:Product;

  constructor(){
    this.prod = new Product(1,"Samsung Mobile",2000.5);
  }

}
