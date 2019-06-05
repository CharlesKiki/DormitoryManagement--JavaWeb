package com.serviceImpl;

import java.util.List;

import com.dao.ApartmentDao;
import com.daoImpl.ApartmentDaoImpl;
import com.entity.Admin;
import com.entity.Apartment;
import com.service.ApartmentService;
import com.tool.PageBean;
import com.tool.PageUtil;

public class ApartmentServiceImpl implements ApartmentService {
	private PageUtil pageUtil = new PageUtil();
	private ApartmentDao apDao=new ApartmentDaoImpl();
	@Override
	public PageBean getPageBean(int pageSize, int page) {
		String hql = "from Apartment a left join fetch a.admin";
		return pageUtil.getPageBean(pageSize, page, hql);
	}

	@Override
	public Boolean save(Apartment apartment,Integer adminId) {
		return apDao.save(apartment, adminId);
	}

	@Override
	public Boolean delete(Integer id) {
		return apDao.delete(id);
	}

	@Override
	public Boolean update(Apartment apartment,Integer adminId) {
		return apDao.update(apartment, adminId);
	}

	@Override
	public Apartment getById(Integer id) {
		return apDao.getById(id);
	}
	public Boolean save(Apartment  apartment,Admin admin){
		return apDao.save(apartment, admin);
	}
	
	public Boolean update(Apartment  apartment,Admin admin){
		return apDao.update(apartment, admin);
	}
	
	public List<Apartment> find(){
		return apDao.find();
	}
}
