import { Component, Input } from '@angular/core';
import { ProductV2Service } from '../../service/product-v2.service';
import { ProductV2 } from '../../model/product-v2';

@Component({
  selector: 'product-v2',
  imports: [],
  templateUrl: './product-v2.component.html',
  styleUrl: './product-v2.component.css'
})
export class ProductV2Component {

  product!: ProductV2;
  productV2Service!: ProductV2Service;

  @Input() id!: number;

  constructor(productService: ProductV2Service) {
    this.productV2Service = productService;
  }

  ngOnInit(): void {
    this.productV2Service.getProduct(this.id).subscribe(

      response => { this.product = response },
      error => { console.error(" error fetching the product ...") }

    );
  }

}
