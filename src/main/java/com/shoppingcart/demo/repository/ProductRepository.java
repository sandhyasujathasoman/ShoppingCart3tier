package com.shoppingcart.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.shoppingcart.demo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}