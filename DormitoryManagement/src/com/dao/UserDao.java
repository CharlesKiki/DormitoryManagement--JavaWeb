package com.dao;

import com.entity.User;


public interface UserDao {
    
	public User  getById(Integer id);
	
	public Boolean save(User user);
	
	public Boolean delete(Integer id);
	
	public Boolean update(User user);
	
	public User login(String name,String pwd);


}
