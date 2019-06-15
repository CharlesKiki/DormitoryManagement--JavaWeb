package com.dao;

import com.entity.User;


//奇怪，只有定义，没有实现，实现在哪里？
public interface UserDao {
    
	public User  getById(Integer id);
	
	public Boolean save(User user);
	
	public Boolean delete(Integer id);
	
	public Boolean update(User user);
	
	public User login(String name,String pwd);


}
