import { Component } from '@angular/core';
import { ProductV2 } from '../../model/product-v2';
import { Observable } from 'rxjs/internal/Observable';
import { ProductV2Service } from '../../service/product-v2.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-pipe-demo',
  imports: [CommonModule],
  templateUrl: './pipe-demo.component.html',
  styleUrl: './pipe-demo.component.css'
})
export class PipeDemoComponent {

  title = 'Angular Pipes Demo';
  today = new Date();
  price = 12345.6789;
  percentage = 0.8567;
  longText = 'This is a very long text that needs slicing for display purposes.';
  jsonData = { name: 'John', age: 30, job: 'Engineer' };
  items = ['Item 1', 'Item 2', 'Item 3', 'Item 4'];

  // For custom pipe demo
  customMessage = 'hello world!';

  asyncProducts!: Observable<ProductV2[]>;

  productService!:ProductV2Service;

  constructor(productService:ProductV2Service){
    this.productService = productService;
  }

  ngOnInit():void {
    this.asyncProducts=this.productService.getAllProducts();
  }



}
