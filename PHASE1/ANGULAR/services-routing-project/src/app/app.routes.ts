import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AddproductComponent } from './component/addproduct/addproduct.component';
import { ProductV2Component } from './component/product-v2/product-v2.component';
import { PipeDemoComponent } from './component/pipe-demo/pipe-demo.component';

export const routes: Routes = [

    { path: '', component: AppComponent },
    { path: 'add-product', component: AddproductComponent },
    { path: 'product/:id', component: ProductV2Component },
    { path: 'pipes-demo', component: PipeDemoComponent},


];
