package com.service;

import com.entity.Admin;
import com.entity.Student;
import com.entity.Visit;
import com.tool.PageBean;

public interface VisitService {
    
	public Visit  getById(Integer id);
	
	public Boolean save(Visit visit ,Admin admin,Student student);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Visit visit ,Admin admin,Student student);
	
	public PageBean getPageBean(int pageSize, int page);
	
	public PageBean getPageBean1(int pageSize, int page,Integer stuId);
}


