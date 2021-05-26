package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.dataAccess.abstracts.UserDao;
import com.example.hrms.entities.concretes.User;
@Service
public class UserManager implements UserService{
	UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.save(user);
		
	}

	@Override
	public void update(User user) {
		userDao.save(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.deleteById(user.getId());
	}

	@Override
	public List<User> getAll() {
		
		return userDao.findAll();
	}

}
