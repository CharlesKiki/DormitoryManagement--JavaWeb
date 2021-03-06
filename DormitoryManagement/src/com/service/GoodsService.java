package com.service;

import com.entity.Admin;
import com.entity.Goods;
import com.entity.Student;
import com.tool.PageBean;

public interface GoodsService {
    
	public Goods getById(Integer id);
		
	public Boolean save(Goods goods ,Admin admin,Student student);
		
	public Boolean delete(Integer id);
	
	public Boolean update(Goods goods ,Admin admin,Student student);
	
	public PageBean getPageBean(int pageSize, int page);
	
	public PageBean getPageBean1(int pageSize, int page,Integer stuId);

}
