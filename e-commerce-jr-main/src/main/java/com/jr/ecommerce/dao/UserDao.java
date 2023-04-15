package com.jr.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jr.ecommerce.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
