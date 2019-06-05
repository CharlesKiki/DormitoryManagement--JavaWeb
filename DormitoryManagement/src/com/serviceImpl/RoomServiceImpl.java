package com.serviceImpl;

import java.util.List;

import com.dao.RoomDao;
import com.daoImpl.RoomDaoImpl;
import com.entity.Apartment;
import com.entity.Room;
import com.service.RoomService;
import com.tool.PageBean;
import com.tool.PageUtil;

public class RoomServiceImpl implements RoomService {
	private PageUtil pageUtil = new PageUtil();
	private RoomDao rDao=new RoomDaoImpl();
	@Override
	public PageBean getPageBean(int pageSize, int page) {
		String hql = "from Room r left join fetch r.apartment";
		return pageUtil.getPageBean(pageSize, page, hql);
	}

	@Override
	public Boolean save(Room room,Apartment apartment) {
		return rDao.save(room, apartment);
	}

	@Override
	public Boolean delete(Integer id) {
		return rDao.delete(id);
	}

	@Override
	public Boolean update(Room room,Apartment apartment) {
		return rDao.update(room, apartment);
	}

	@Override
	public Room getById(Integer id) {
		return rDao.getById(id);
	}
	
	public List<Room> find(){
		return rDao.find();
	}

}
