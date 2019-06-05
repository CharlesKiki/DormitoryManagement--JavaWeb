package com.dao;

import com.entity.Student;


public interface StudentDao {
    
	public Student getById(Integer id);
	
	public Boolean save(Student student);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Student student);
	
	public Student getByNum(String stuNum);
   
	
}
