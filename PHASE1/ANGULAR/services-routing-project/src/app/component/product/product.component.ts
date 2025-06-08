import { Component,Input } from '@angular/core';
import { Product } from '../../model/product';
import { ProductService } from '../../service/product.service';

@Component({
  selector: 'product',
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  product!: Product;
  productService! :ProductService;

  @Input() id!: number;

  constructor( productService:ProductService) {
    this.productService = productService;  
    
    
  }

  ngOnInit(): void {
    this.product = this.productService.getProduct(this.id);
  }



}
