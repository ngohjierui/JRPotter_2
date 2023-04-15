package com.jr.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jr.ecommerce.entity.Cart;
import com.jr.ecommerce.entity.User;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer > {
    public List<Cart> findByUser(User user);
}
