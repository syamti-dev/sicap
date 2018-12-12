package com.ingresos.backend.models.service;

import java.util.List;

import com.ingresos.backend.models.entity.Users;

public interface IUserService {

	public List<Users> findAll();
	
	public void saveorUpdate (Users user);
	
	public void delete (Long idUser);
	
}
