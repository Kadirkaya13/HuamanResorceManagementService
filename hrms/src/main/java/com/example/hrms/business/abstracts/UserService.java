package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.User;

public interface UserService {
	void add( User  user);
	void update(User  user);
	void delete(User  user);
	List<User> getAll();
}
