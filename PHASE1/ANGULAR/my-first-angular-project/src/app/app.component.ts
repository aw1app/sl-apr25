import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductComponent } from './component/product/product.component';
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


  parentFunc=(childEventObj:any):void =>{
    console.log(`Oh ok, some child with name ${childEventObj.name} emitted an myEvent`);
    console.log("The data that child gave is " + childEventObj.data);
  }

  f1 = () => console.log("Hi")
}
