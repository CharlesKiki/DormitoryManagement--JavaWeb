package com.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.GoodsDao;
import com.entity.Admin;
import com.entity.Goods;
import com.entity.Student;
import com.tool.CommonDao;
import com.util.HibernateUtil;

public class GoodsDaoImpl implements GoodsDao {

	private static final Log log = LogFactory.getLog(GoodsDaoImpl.class);
	private CommonDao  dao=new CommonDao();
	@Override
	public Goods getById(Integer id) {
		log.debug("getting Goods instance with id: " + id);
		try {
			Goods instance =(Goods)dao.getById(Goods.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean save(Goods goods, Admin admin, Student student) {
		log.debug("saving  goods instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		try {
			tx = session.beginTransaction();
			goods.setAdmin(admin);
			goods.setStudent(student);
			dao.save(goods);
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
		log.debug("delete Goods instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		Goods goods = null;
		try {
			tx = session.beginTransaction();
			goods = (Goods)session.get(Goods.class,id);
			session.delete(goods);
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
	public Boolean update(Goods goods, Admin admin, Student student) {
		log.debug("updating goods instance");
		Boolean status = false;
		try {
			goods.setAdmin(admin);
			goods.setStudent(student);
			dao.update(goods);
			log.debug("update successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}

}
