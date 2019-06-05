package com.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.HealthDao;
import com.entity.Health;
import com.entity.Room;
import com.tool.CommonDao;
import com.util.HibernateUtil;

public class HealthDaoImpl implements HealthDao {
	private static final Log log = LogFactory.getLog(HealthDaoImpl.class);
	private CommonDao  dao=new CommonDao();
	@Override
	public Health getById(Integer id) {
		log.debug("getting health instance with id: " + id);
		try {
			Health instance =(Health)dao.getById(Health.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean save(Health health, Room room) {
		log.debug("saving health instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		try {
			tx = session.beginTransaction();
			health.setRoom(room);
			dao.save(health);
			tx.commit();
			status = true;
			log.debug("save successful");
			
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			util.closeSession(session);
		}
		return status;
	}

	@Override
	public Boolean delete(Integer id) {
		log.debug("delete Health instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		Health health = null;
		try {
			tx = session.beginTransaction();
			health = (Health)session.get(Health.class,id);
			session.delete(health);
			tx.commit();
			status = true;
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			util.closeSession(session);
		}
		return status;
	}

	@Override
	public Boolean update(Health health, Room room) {
		log.debug("updating health instance");
		Boolean status = false;
		try {
			health.setRoom(room);
			dao.update(health);
			log.debug("update successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}

}
