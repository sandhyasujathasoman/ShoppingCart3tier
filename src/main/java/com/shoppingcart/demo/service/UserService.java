package com.shoppingcart.demo.service;

import com.shoppingcart.demo.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
