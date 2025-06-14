import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ProductV2 } from '../../model/product-v2';
import { Product } from '../../model/product';
import { ProductV2Service } from '../../service/product-v2.service';

@Component({
  selector: 'addproduct',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './addproduct.component.html',
  styleUrl: './addproduct.component.css'
})
export class AddproductComponent {

  productForm!: FormGroup; 
  productV2Service!: ProductV2Service; 

  constructor( private fb: FormBuilder, productService: ProductV2Service){
    this.productV2Service = productService;

    this.productForm = this.fb.group(

      {
        productName: ['', [Validators.required, Validators.minLength(3)]],
        productPrice: ['', [Validators.required, Validators.pattern(/^\d+(\.\d{1,2})?$/),  Validators.max(100000)]]
      }

    );

  }

  addProduct=()=>{

    let name = this.productForm.get('productName')?.value;
    let price = this.productForm.get('productPrice')?.value;

    let tempProduct = new ProductV2(1, name, price, 'some desc');

    console.log("Successfully created product! ");

    this.productV2Service.addProduct(tempProduct);

  }

}
