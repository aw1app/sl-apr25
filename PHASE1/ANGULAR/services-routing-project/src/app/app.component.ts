import { Component } from '@angular/core';
import { Router, RouterLink, RouterModule, RouterOutlet } from '@angular/router';
import { ProductComponent } from './component/product/product.component';
import { ProductV2Component } from './component/product-v2/product-v2.component';
import { AddproductComponent } from './component/addproduct/addproduct.component';

@Component({
  selector: 'app-root',
  imports: [RouterModule, RouterOutlet, RouterLink, ProductComponent, ProductV2Component, AddproductComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Amazon.com';
}
