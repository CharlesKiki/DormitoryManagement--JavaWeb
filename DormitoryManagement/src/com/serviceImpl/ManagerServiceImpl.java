package com.serviceImpl;

import com.dao.ManagerDao;
import com.daoImpl.ManagerDaoImpl;
import com.entity.Manager;
import com.service.ManagerService;
import com.tool.PageBean;
import com.tool.PageUtil;

public class ManagerServiceImpl implements ManagerService {
	
	PageUtil pageUtil = new PageUtil();
    ManagerDao manDao=new ManagerDaoImpl();
	
	@Override
	public PageBean getPageBean(int pageSize, int page) {
		String hql = "from Manager";
		return pageUtil.getPageBean(pageSize, page, hql);
	}

	@Override
	public Boolean save(Manager manager) {

		return manDao.save(manager);
	}

	public Boolean delete(Integer id) {

		return manDao.delete(id);
	}

	public Boolean update(Manager manager) {

		return manDao.update(manager);
	}

	public Manager getById(Integer id) {
		return manDao.getById(id);
	}


}
