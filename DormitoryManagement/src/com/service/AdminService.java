package com.service;

import java.util.List;

import com.entity.Admin;


public interface AdminService {
	
	public Boolean update(Admin admin);

	public Admin  getById(Integer id);
	
	public Admin login(String name,String pwd);
	
	public List<Admin> find();

}
