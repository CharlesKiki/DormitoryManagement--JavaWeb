package com.dao;

import java.util.List;

import com.entity.Admin;




public interface AdminDao {

    public Admin  getById(Integer id);
	
	public Boolean save(Admin admin);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Admin admin);
	
	public Admin login(String name,String pwd);
	
	public List<Admin> find();

	
}
