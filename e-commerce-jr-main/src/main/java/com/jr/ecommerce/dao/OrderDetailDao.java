package com.jr.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import com.jr.ecommerce.entity.OrderDetail;
import com.jr.ecommerce.entity.User;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);
}
