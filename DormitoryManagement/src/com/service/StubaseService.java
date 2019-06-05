package com.service;

import com.entity.Stubase;
import com.tool.PageBean;

public interface StubaseService {
    
	public Stubase getById(Integer id);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Stubase Stubase);
	
	public PageBean getPageBean(int pageSize, int page);
	
	public Stubase save(Integer id);

}
