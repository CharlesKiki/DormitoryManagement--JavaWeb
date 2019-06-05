package com.service;

import com.entity.Health;
import com.entity.Room;
import com.tool.PageBean;

public interface HealthService {
	public Health getById(Integer id);
	
	public Boolean save(Health health ,Room room);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Health health ,Room room);

	public PageBean getPageBean(int pageSize, int page);

	public PageBean getPageBean1(int pageSize, int page,Integer roomId);
}
