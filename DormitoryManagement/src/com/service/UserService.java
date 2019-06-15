package com.service;

import com.entity.User;
//这里只有定义，实现在IMPL为后缀名称类中
public interface UserService {
	
	public Boolean update(User user);

	public User  getById(Integer id);
	
	public User login(String name,String pwd);

}
