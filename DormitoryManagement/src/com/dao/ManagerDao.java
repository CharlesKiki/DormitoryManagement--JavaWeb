package com.dao;

import com.entity.Manager;

public interface ManagerDao {
    
	public Manager getById(Integer id);
	
	public Boolean save(Manager manager);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Manager manager);

}
