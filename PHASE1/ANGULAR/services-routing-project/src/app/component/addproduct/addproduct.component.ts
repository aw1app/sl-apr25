import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ProductV2 } from '../../model/product-v2';
import { Product } from '../../model/product';

@Component({
  selector: 'addproduct',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './addproduct.component.html',
  styleUrl: './addproduct.component.css'
})
export class AddproductComponent {

  productForm!: FormGroup;  

  constructor( private fb: FormBuilder){

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

    let tempProduct = new Product(1, name, price, '', true, 'images/444.png');

    console.log("Successfully created product! ");

  }

}
