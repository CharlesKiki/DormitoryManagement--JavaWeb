package com.dao;

import com.entity.Stubase;


public interface StubaseDao {
    
	public Stubase getById(Integer id);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Stubase Stubase);
	
	public Stubase save(Integer id);
	

}
