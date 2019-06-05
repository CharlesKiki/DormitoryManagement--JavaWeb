package com.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.VisitDao;
import com.entity.Admin;
import com.entity.Student;
import com.entity.Visit;
import com.tool.CommonDao;
import com.util.HibernateUtil;

public class VisitDaoImpl implements VisitDao {

	private static final Log log = LogFactory.getLog(VisitDaoImpl.class);
	private CommonDao  dao=new CommonDao();
	@Override
	public Visit getById(Integer id) {
		log.debug("getting Visit instance with id: " + id);
		try {
			Visit instance =(Visit)dao.getById(Visit.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean save(Visit visit, Admin admin, Student student) {
		log.debug("saving visit instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		try {
			tx = session.beginTransaction();
			visit.setAdmin(admin);
			visit.setStudent(student);
			dao.save(visit);
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
		log.debug("delete Visit instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		Visit visit = null;
		try {
			tx = session.beginTransaction();
			visit = (Visit)session.get(Visit.class,id);
			session.delete(visit);
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
	public Boolean update(Visit visit ,Admin admin,Student student) {
		log.debug("updating visit instance");
		Boolean status = false;
		try {
			visit.setAdmin(admin);
			visit.setStudent(student);
			dao.update(visit);
			log.debug("update successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}

}
