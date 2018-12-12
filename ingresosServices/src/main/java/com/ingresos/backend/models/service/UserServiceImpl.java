package com.ingresos.backend.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ingresos.backend.models.dao.IUserDao;
import com.ingresos.backend.models.entity.Users;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	
	@Override
	@Transactional (readOnly=true)
	public List<Users> findAll() {
		return (List<Users>) userDao.findAll();
	}


	@Override
	@Transactional
	public void saveorUpdate(Users user) {
		userDao.save(user);
	}



	@Override
	@Transactional 
	public void delete(Long idUser) {
		userDao.deleteById(idUser);
	}
	
	

}
