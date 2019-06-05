package com.serviceImpl;

import com.dao.StubaseDao;
import com.daoImpl.StubaseDaoImpl;
import com.entity.*;
import com.service.StubaseService;
import com.tool.PageBean;
import com.tool.PageUtil;

public class StubaseServiceImpl implements StubaseService {
	private PageUtil pageUtil = new PageUtil();
	private StubaseDao stubaseDao=new StubaseDaoImpl();
	@Override
	public Stubase getById(Integer id) {
		return stubaseDao.getById(id);
	}

	@Override
	public Boolean delete(Integer id) {
		return stubaseDao.delete(id);
	}

	@Override
	public Boolean update(Stubase Stubase) {
		return stubaseDao.update(Stubase);
	}

	@Override
	public PageBean getPageBean(int pageSize, int page) {
		String hql="from Stubase s left join fetch s.student left join fetch s.room";
		return pageUtil.getPageBean(pageSize, page, hql);
	}
	public Stubase save(Integer id){
		return stubaseDao.save(id);
	}
}
