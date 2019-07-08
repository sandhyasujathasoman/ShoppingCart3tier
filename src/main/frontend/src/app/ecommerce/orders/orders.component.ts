import {Component, OnInit,ViewChild} from '@angular/core';
import {ProductOrders} from "../models/product-orders";
import {Subscription} from "rxjs/Subscription";
import {EcommerceService} from "../services/ecommerce-service";
import {ProductOrder} from "../models/product-order";
import {ProductsComponent} from "../products/products.component";
import {ShoppingCartComponent} from "../shopping-cart/shopping-cart.component";

@Component({
    selector: 'app-orders',
    templateUrl: './orders.component.html',
    styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {
    orders: ProductOrders;
    total: number;
    paid: boolean;
    sub: Subscription;
    productOrders: ProductOrder[] = [];
    orderFinished = false;
    constructor(private ecommerceService: EcommerceService) {
        this.orders = this.ecommerceService.ProductOrders;
    }
    @ViewChild('productsC')
    productsC: ProductsComponent;

    @ViewChild('shoppingCartC')
    shoppingCartC: ShoppingCartComponent;

    @ViewChild('ordersC')
    ordersC: OrdersComponent;

    ngOnInit() {
        this.paid = false;
        this.sub = this.ecommerceService.OrdersChanged.subscribe(() => {
            this.orders = this.ecommerceService.ProductOrders;
        });
        this.loadTotal();
    }

    pay() {
        this.paid = true;
        this.ecommerceService.saveOrder(this.orders).subscribe();
    }

    loadTotal() {
        this.sub = this.ecommerceService.TotalChanged.subscribe(() => {
            this.total = this.ecommerceService.Total;
        });
    }
}