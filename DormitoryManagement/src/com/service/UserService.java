package com.service;

import com.entity.User;

public interface UserService {
	
	public Boolean update(User user);

	public User  getById(Integer id);
	
	public User login(String name,String pwd);

}
