package com.shoppingcart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
