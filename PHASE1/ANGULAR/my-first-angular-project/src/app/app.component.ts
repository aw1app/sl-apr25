import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductComponent } from './product/product.component';
import { ProductListComponent } from './component/product-list/product-list.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ProductComponent, ProductListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'my-first-angular-project';

  x=10;

  f1 = () => console.log("Hi")
}
