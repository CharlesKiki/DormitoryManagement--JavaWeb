package com.dao;

import com.entity.Admin;
import com.entity.Student;
import com.entity.Visit;

public interface VisitDao {
	
    public Visit  getById(Integer id);
	
	public Boolean save(Visit visit ,Admin admin,Student student);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Visit visit ,Admin admin,Student student);

}
