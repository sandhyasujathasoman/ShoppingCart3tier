package com.shoppingcart.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.shoppingcart.demo.model.OrderProduct;
import com.shoppingcart.demo.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}