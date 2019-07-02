import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './ecommerce/login/login.component';
import { RegisterComponent } from './ecommerce/register/register.component';
import {EcommerceComponent} from './ecommerce/ecommerce.component';

const routes: Routes = [
    { path: '', component: EcommerceComponent },
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent }
];

export const appRoutingModule: ModuleWithProviders= RouterModule.forRoot(routes);