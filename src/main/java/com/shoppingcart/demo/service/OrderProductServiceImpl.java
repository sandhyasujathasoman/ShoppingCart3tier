package com.shoppingcart.demo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shoppingcart.demo.model.OrderProduct;
import com.shoppingcart.demo.repository.OrderProductRepository;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}