package com.serviceImpl;

import com.dao.HealthDao;
import com.daoImpl.HealthDaoImpl;
import com.entity.Health;
import com.entity.Room;
import com.service.HealthService;
import com.tool.PageBean;
import com.tool.PageUtil;

public class HealthServiceImpl implements HealthService {
	private PageUtil pageUtil = new PageUtil();
	private HealthDao healthDao=new HealthDaoImpl();
	@Override
	public Health getById(Integer id) {
		return healthDao.getById(id);
	}

	@Override
	public Boolean save(Health health, Room room) {
		return healthDao.save(health, room);
	}

	@Override
	public Boolean delete(Integer id) {
		return healthDao.delete(id);
	}

	@Override
	public Boolean update(Health health, Room room) {
		return healthDao.update(health, room);
	}

	@Override
	public PageBean getPageBean(int pageSize, int page) {
		String hql = "from Health h left join fetch h.room";
		return pageUtil.getPageBean(pageSize, page, hql);
	}
	
	public PageBean getPageBean1(int pageSize, int page,Integer roomId){
		String hql = "from Health h left join fetch h.room where h.room.roomId="+roomId;
		return pageUtil.getPageBean(pageSize, page, hql);
	}
}
