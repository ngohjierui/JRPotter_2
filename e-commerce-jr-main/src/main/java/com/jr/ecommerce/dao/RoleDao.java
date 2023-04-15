package com.jr.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jr.ecommerce.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
