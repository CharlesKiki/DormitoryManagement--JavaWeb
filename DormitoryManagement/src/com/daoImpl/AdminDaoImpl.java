package com.daoImpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.AdminDao;
import com.entity.Admin;
import com.tool.CommonDao;
import com.util.HibernateUtil;

public class AdminDaoImpl implements AdminDao {
	private static final Log log = LogFactory.getLog(AdminDaoImpl.class);
	private CommonDao  dao=new CommonDao();
	@Override
	public Admin getById(Integer id) {
		log.debug("getting Admin instance with id: " + id);
		try {
			Admin instance =(Admin)dao.getById(Admin.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean save(Admin admin) {
		log.debug("saving admin instance");
		Boolean status = false;
		try {
			dao.save(admin);
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
		log.debug("deleting Admin instance");
		Boolean status = false;
		try {
			dao.delete(Admin.class, id);
			status = true;
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
		return status;
	}

	@Override
	public Boolean update(Admin admin) {
		log.debug("updating admin instance");
		Boolean status = false;
		try {
			dao.update(admin);
			log.debug("update successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}
	
	public Admin login(String name,String pwd){
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Admin admin = null;
		try {
			String hql = "select a from Admin as a where a.adminName=:loginName and a.adminPwd=:loginPwd";
			Query query = session.createQuery(hql);
			query.setString("loginName", name);
			query.setString("loginPwd", pwd);
			query.setMaxResults(1);
			tx = session.beginTransaction();
			admin = (Admin) query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return admin;
	}
	public List<Admin> find(){
		List<Admin> list;
		String hql="from Admin";
		list=dao.find(hql);
		return list;
	}
}
