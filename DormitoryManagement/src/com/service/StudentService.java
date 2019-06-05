package com.service;

import com.entity.Student;
import com.tool.PageBean;

public interface StudentService {
	
	public PageBean getPageBean(int pageSize, int page);

	public Boolean save(Student student);

	public Boolean delete(Integer id);

	public Boolean update(Student student);

	public Student getById(Integer id);
	
	public Student getByNum(String stuNum);


}
