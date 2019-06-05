package com.daoImpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.dao.RoomDao;
import com.entity.Apartment;
import com.entity.Room;
import com.tool.CommonDao;

public class RoomDaoImpl implements RoomDao {
	private static final Log log = LogFactory.getLog(ManagerDaoImpl.class);
	private CommonDao  dao=new CommonDao();
	@Override
	public Room getById(Integer id) {
		log.debug("getting room instance with id: " + id);
		try {
			Room instance =(Room)dao.getById(Room.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean save(Room room,Apartment apartment) {
		log.debug("saving room instance");
		Boolean status = false;
		try {
			room.setApartment(apartment);
			dao.save(room);
			log.debug("save successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		return status;
	}

	@Override
	public Boolean delete(Integer id) {
		log.debug("deleting Room instance");
		Boolean status = false;
		try {
			dao.delete(Room.class,id);
			status = true;
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
		return status;
	}

	@Override
	public Boolean update(Room room,Apartment apartment) {
		log.debug("updating room instance");
		Boolean status = false;
		try {
			room.setApartment(apartment);
			dao.update(room);
			log.debug("update successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}
	
	public List<Room> find(){
		List<Room> list;
		String hql="from Room r left join fetch r.apartment where r.bedNum-r.staNum>0 ";
		list=dao.find(hql);
		return list;
	}

}
