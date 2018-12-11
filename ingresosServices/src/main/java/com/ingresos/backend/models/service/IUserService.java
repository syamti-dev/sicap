package com.ingresos.backend.models.service;

import java.util.List;

import com.ingresos.backend.models.entity.Users;

public interface IUserService {

	public List<Users> findAll();
	
}
