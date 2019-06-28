package com.shoppingcart.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.shoppingcart.demo.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}