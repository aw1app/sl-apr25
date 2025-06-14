import { Component, Input } from '@angular/core';
import { ProductV2Service } from '../../service/product-v2.service';
import { ProductV2 } from '../../model/product-v2';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'product-v2',
  imports: [],
  templateUrl: './product-v2.component.html',
  styleUrl: './product-v2.component.css'
})
export class ProductV2Component {

  product!: ProductV2;
  productV2Service!: ProductV2Service;
  route!: ActivatedRoute;

  @Input() id!: number;

  constructor(productService: ProductV2Service, route: ActivatedRoute) {
    this.productV2Service = productService;
    this.route = route;
  }

  ngOnInit(): void {

    this.route.paramMap.subscribe(params => {

      const productId = params.get('id');

      if (productId !== null) {

        this.id = Number(productId);

        this.productV2Service.getProduct(this.id).subscribe(
          response => { this.product = response },
          error => { console.error(" error fetching the product ...") }
        );
        
      }

    });


  }

  delete = (id: number): void => {
    this.productV2Service.deleteProduct(id);
  }

}
