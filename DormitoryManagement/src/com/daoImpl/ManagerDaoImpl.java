package com.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.ManagerDao;
import com.entity.Admin;
import com.entity.Manager;
import com.tool.CommonDao;
import com.util.HibernateUtil;

public class ManagerDaoImpl implements ManagerDao {

	private static final Log log = LogFactory.getLog(ManagerDaoImpl.class);
	private CommonDao  dao=new CommonDao();
	@Override
	public Manager getById(Integer id) {
		log.debug("getting manager instance with id: " + id);
		try {
			Manager instance =(Manager)dao.getById(Manager.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean save(Manager manager) {
		log.debug("saving Manager instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		try {
			tx = session.beginTransaction();
			Admin admin=new Admin();
			admin.setAdminName(manager.getManName());
			admin.setAdminPwd(manager.getManPhone());
			admin.setAdminPow(2);
			admin.setManager(manager);
			dao.save(manager);
			dao.save(admin);
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
		log.debug("delete Manager instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		Manager manager = null;
		Admin admin=null;
		try {
			tx = session.beginTransaction();
			admin = (Admin)session.get(Admin.class,id);
			manager=(Manager)session.get(Manager.class,id);
			session.delete(manager);
			if(admin!=null){
				session.delete(admin);
			}
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
	public Boolean update(Manager manager) {
		log.debug("updating manager instance");
		Boolean status = false;
		try {
			dao.update(manager);
			log.debug("update successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}

}
