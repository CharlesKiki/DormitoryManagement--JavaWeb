package com.service;

import java.util.List;

import com.entity.Admin;
import com.entity.Apartment;
import com.tool.PageBean;

public interface ApartmentService {
	
	public PageBean getPageBean(int pageSize, int page);

	public Boolean save(Apartment apartment,Integer adminId);

	public Boolean delete(Integer id);

	public Boolean update(Apartment apartment,Integer adminId);

	public Apartment getById(Integer id);

	public Boolean save(Apartment  apartment,Admin admin);
	
	public Boolean update(Apartment  apartment,Admin admin);
	
	public List<Apartment> find();
}
