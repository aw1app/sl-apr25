import { Injectable } from '@angular/core';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products!:Product[];

  constructor() { 

    this.products = [

      new Product(0, "HP Mouse", 205, 'This is a great mouse with awesome features.', true,
        'images/HPMouse.JPG'),

      new Product(1, "Dell Laptop", 24000.5, 'This is a great value Laptop with awesome features.', false,
        'images/dell.JPG'),

      new Product(2, "IPhone", 27000.5, 'This is a great mobile with flip features.', true,
        'images/Apple-Phone.JPG'),

      new Product(3, "Motorola Zing", 1200.55, 'This is a elite mobile with awesome features.', true,
        'images/motorola.PNG')
    ]

  }

  //CRUD Ops

  //Read ops
  getProduct = (id:number): Product =>{
    return this.products[id];
  }

  //list of product
  // delete a product
  // adding a product

}
