import { Component, EventEmitter, Input, Output } from '@angular/core';
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

  // Declare that Product comp will give data to the parent component
  // through the myEvent event. 
  // In our case the data is of number type
  @Output() myEvent = new EventEmitter<any>();


  constructor() {
    this.product = new Product(1);
  }

  ngOnInit(): void {
    this.product.name = this.name;
    this.product.price = this.price;
    this.product.description = this.description;
    this.product.inStock = this.inStock;
  }

  generateMyEvent = (data:number): void => {
    console.log("Inside Product comp's generateMyEvent()  function")
    this.myEvent.emit( {"data":data, "name": this.product.name } );
  }

  f1 = (): void => {
    console.log(`f1 was invoked.. on ${this.product.name} product`);
  }

  increasePrice = (): void => {
    this.product.price = this.product.price + 10
  }


}
