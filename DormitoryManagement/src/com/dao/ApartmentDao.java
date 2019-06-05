package com.dao;

import java.util.List;

import com.entity.Admin;
import com.entity.Apartment;


public interface ApartmentDao {
    
	public Apartment  getById(Integer id);
	
	public Boolean save(Apartment  apartment,Integer adminId);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Apartment  apartment,Integer adminId);
	
	public Boolean save(Apartment  apartment,Admin admin);
	
	public Boolean update(Apartment  apartment,Admin admin);
		
	public List<Apartment> find();


}
