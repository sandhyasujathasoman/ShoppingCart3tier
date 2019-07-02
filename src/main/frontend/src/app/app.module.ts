import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { EcommerceComponent } from './ecommerce/ecommerce.component';
import { ProductsComponent } from './ecommerce/products/products.component';
import { OrdersComponent } from './ecommerce/orders/orders.component';
import { ShoppingCartComponent } from './ecommerce/shopping-cart/shopping-cart.component';
import { ModelsComponent } from './ecommerce/models/models.component';
import { ServicesComponent } from './ecommerce/services/services.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { EcommerceService } from './ecommerce/services/ecommerce-service';
import { LoginComponent } from './ecommerce/login/login.component';
import { RegisterComponent } from './ecommerce/register/register.component';
import { AlertService } from './ecommerce/services/alert-service.service';
import { UserService } from './ecommerce/services/user-service.service';
import { AuthenticationService } from './ecommerce/services/authentication-service.service';
import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { appRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    EcommerceComponent,
    ProductsComponent,
    OrdersComponent,
    ShoppingCartComponent,
    ModelsComponent,
    ServicesComponent,
    LoginComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    appRoutingModule
  ],
  providers: [
    EcommerceService,
    AlertService,
    UserService,
    AuthenticationService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
