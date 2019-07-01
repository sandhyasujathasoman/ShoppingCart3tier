import { Routes, RouterModule } from '@angular/router';


import { LoginComponent } from './ecommerce/login/login.component';
import { RegisterComponent } from './ecommerce/register/register.component';


const routes: Routes = [
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },

    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

export const appRoutingModule = RouterModule.forRoot(routes);