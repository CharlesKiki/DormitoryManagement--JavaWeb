package com.daoImpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.AdminDao;
import com.dao.ApartmentDao;
import com.entity.Admin;
import com.entity.Apartment;
import com.tool.CommonDao;
import com.util.HibernateUtil;

public class ApartmentDaoImpl implements ApartmentDao {
	private static final Log log = LogFactory.getLog(ApartmentDaoImpl.class);
	private CommonDao  dao=new CommonDao();
	private AdminDao adminDao=new AdminDaoImpl();
	@Override
	public Apartment getById(Integer id) {
		log.debug("getting Apartment instance with id: " + id);
		try {
			Apartment instance =(Apartment)dao.getById(Apartment.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean save(Apartment  apartment,Integer adminId) {
		log.debug("saving apartment instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		try {
			tx = session.beginTransaction();
			Admin admin=null;
			admin=adminDao.getById(adminId);
			apartment.setAdmin(admin);
			session.save(apartment);
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
		log.debug("deleting Apartment instance");
		Boolean status = false;
		try {
			dao.delete(Apartment.class, id);
			status = true;
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
		return status;
	}

	@Override
	public Boolean update(Apartment apartment,Integer adminId) {
		log.debug("updating  apartment instance");
		Boolean status = false;
		try {
			Admin admin=null;
			admin=adminDao.getById(adminId);
			apartment.setAdmin(admin);
			dao.update(apartment);
			log.debug("updatge successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}
	
	public Boolean save(Apartment apartment,Admin admin){
		log.debug("saving apartment instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		try {
			tx = session.beginTransaction();
			apartment.setAdmin(admin);
			session.save(apartment);
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
	
	public Boolean update(Apartment  apartment,Admin admin){
		log.debug("updating  apartment instance");
		Boolean status = false;
		try {
			apartment.setAdmin(admin);
			dao.update(apartment);
			log.debug("updatge successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
		
	}

	public List<Apartment> find(){
		List<Apartment> list;
		String hql="from Apartment";
		list=dao.find(hql);
		return list;
	}
}
