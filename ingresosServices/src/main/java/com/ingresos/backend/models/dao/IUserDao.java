package com.ingresos.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ingresos.backend.models.entity.Users;


public interface IUserDao extends CrudRepository<Users, Long>{
	
	
	
	
}
