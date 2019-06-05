package com.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.dao.StubaseDao;
import com.entity.Room;
import com.entity.Stubase;
import com.service.StubaseService;
import com.serviceImpl.StubaseServiceImpl;
import com.tool.CommonDao;

public class StubaseDaoImpl implements StubaseDao {
	private static final Log log = LogFactory.getLog(StubaseDaoImpl.class);
	private CommonDao  dao=new CommonDao();
	@Override
	public Stubase getById(Integer id) {
		log.debug("getting Stubase instance with id: " + id);
		try {
			Stubase instance =(Stubase)dao.getById(Stubase.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean delete(Integer id) {
		log.debug("deleting Stubase instance");
		Boolean status = false;
		try {
			dao.delete(Stubase.class, id);
			status = true;
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
		return status;
	}

	@Override
	public Boolean update(Stubase stubase) {
		log.debug("updating Stubase instance");
		Room room=new Room();
		room=stubase.getRoom();
		Integer num=room.getStaNum()+1;
		Boolean status = false;
		try {
			room.setStaNum(num);
			dao.update(stubase);
			dao.update(room);
			log.debug("updatge successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}
	
	public Stubase save(Integer id){
		Stubase stubase=new Stubase();
		stubase=this.getById(id);
		log.debug("saving stubase instance");
		try {
			stubase.setStuId(id);
			dao.save(stubase);
			log.debug("save successful");
			return stubase;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		
	}

}
