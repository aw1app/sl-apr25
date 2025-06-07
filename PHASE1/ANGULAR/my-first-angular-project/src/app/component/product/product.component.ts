import { Component, Input } from '@angular/core';
import { Product } from '../../model/product';

@Component({
  selector: 'product',
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  product!: Product;
  @Input() name!: string;
  @Input() price!: number;
  @Input() description!: string;
  @Input() inStock!: boolean;
  @Input() imagePath!: string;

  constructor() {
    this.product =new Product(1, this.name, 12000.55, 'This is a elite mobile with awesome features.', true,
      'images/motorola.PNG');
  }

  ngOnInit():void{
    this.product.name = this.name;
    this.product.price = this.price;
    this.product.description = this.description;
    this.product.inStock = this.inStock;
  }

   f1 = ():void => {

    let x=10;

  }

}
