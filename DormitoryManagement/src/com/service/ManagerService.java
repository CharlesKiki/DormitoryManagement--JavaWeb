package com.service;

import com.entity.Manager;
import com.tool.PageBean;

public interface ManagerService {
	
	public PageBean getPageBean(int pageSize, int page);

	public Boolean save(Manager manager);

	public Boolean delete(Integer id);

	public Boolean update(Manager manager);

	public Manager getById(Integer id);

}
