package com.dao;

import com.entity.Admin;
import com.entity.Goods;
import com.entity.Student;


public interface GoodsDao {
	   
    public Goods getById(Integer id);
	
	public Boolean save(Goods goods ,Admin admin,Student student);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Goods goods ,Admin admin,Student student);
}
