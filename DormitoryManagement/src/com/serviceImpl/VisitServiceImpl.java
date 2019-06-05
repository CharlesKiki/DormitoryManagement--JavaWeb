package com.serviceImpl;

import com.dao.VisitDao;
import com.daoImpl.VisitDaoImpl;
import com.entity.Admin;
import com.entity.Student;
import com.entity.Visit;
import com.service.VisitService;
import com.tool.PageBean;
import com.tool.PageUtil;

public class VisitServiceImpl implements VisitService {

	private PageUtil pageUtil = new PageUtil();
	private VisitDao visitDao=new VisitDaoImpl();
	@Override
	public Visit getById(Integer id) {
		return visitDao.getById(id);
	}

	@Override
	public Boolean save(Visit visit, Admin admin, Student student) {
		return visitDao.save(visit, admin, student);
	}

	@Override
	public Boolean delete(Integer id) {
		return visitDao.delete(id);
	}

	@Override
	public Boolean update(Visit visit ,Admin admin,Student student) {
		return visitDao.update(visit, admin, student);
	}

	@Override
	public PageBean getPageBean(int pageSize, int page) {
		String hql = "from Visit v left join fetch v.student left join fetch v.admin";
		return pageUtil.getPageBean(pageSize, page, hql);
	}
	
	public PageBean getPageBean1(int pageSize, int page,Integer stuId){
		String hql = "from Visit v left join fetch v.student left join fetch v.admin where v.student.stuId="+stuId;
		return pageUtil.getPageBean(pageSize, page, hql);
	}

}
