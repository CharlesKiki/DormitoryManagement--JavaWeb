package com.serviceImpl;

import com.dao.GoodsDao;
import com.daoImpl.GoodsDaoImpl;
import com.entity.Admin;
import com.entity.Goods;
import com.entity.Student;
import com.service.GoodsService;
import com.tool.PageBean;
import com.tool.PageUtil;

public class GoodsServiceImpl implements GoodsService {
	private PageUtil pageUtil = new PageUtil();
	private GoodsDao goodsDao=new GoodsDaoImpl();

	@Override
	public Goods getById(Integer id) {
		return goodsDao.getById(id);
	}

	@Override
	public Boolean save(Goods goods, Admin admin, Student student) {
		return goodsDao.save(goods, admin, student);
	}

	@Override
	public Boolean delete(Integer id) {
		return goodsDao.delete(id);
	}

	@Override
	public Boolean update(Goods goods, Admin admin, Student student) {
		return goodsDao.update(goods, admin, student);
	}

	@Override
	public PageBean getPageBean(int pageSize, int page) {
		String hql = "from Goods g left join fetch g.student left join fetch g.admin";
		return pageUtil.getPageBean(pageSize, page, hql);
	}
	
	public PageBean getPageBean1(int pageSize, int page,Integer stuId){
		String hql = "from Goods g left join fetch g.student left join fetch g.admin where g.student.stuId="+stuId;
		return pageUtil.getPageBean(pageSize, page, hql);
	}
}
