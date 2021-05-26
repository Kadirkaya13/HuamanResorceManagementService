package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/add")
	public void add(User user) {
		userService.add(user);
	}
	@GetMapping("/update")
	public void update(User user) {
		userService.update(user);
	}
	@GetMapping("/delete")
	public void delete(User user) {
		userService.delete(user);
	}
	@GetMapping("/getall")
	public List<User> getAll(){
		return userService.getAll();
	}
}
