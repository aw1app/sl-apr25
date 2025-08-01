import { Component } from '@angular/core';
import { ProductV2 } from '../../model/product-v2';
import { Observable } from 'rxjs/internal/Observable';
import { ProductV2Service } from '../../service/product-v2.service';
import { CommonModule } from '@angular/common';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-pipe-demo',
  imports: [CommonModule],
  standalone:true,
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
  router!: Router;

  constructor(productService:ProductV2Service, router: Router){
    this.productService = productService;
    this.router = router;
  }

  ngOnInit():void {
    console.log("INSIDE PipeDemoComponent ngOnInit.")
    this.asyncProducts=this.productService.getAllProducts();
  }

  ngOnChanges():void {
    console.log("INSIDE PipeDemoComponent ngOnChanges.");
    this.asyncProducts=this.productService.getAllProducts();
  }

  delete = (id: number): void => {
    this.productService.deleteProduct(id);
    // after delete fetch the list of product afresh
    // this.asyncProducts=this.productService.getAllProducts();
    // this.router.navigate(['pipes-demo']);
  }

}
