package com.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.UserDao;
import com.entity.User;
import com.tool.CommonDao;
import com.util.HibernateUtil;

public class UserDaoImpl implements UserDao {
	private static final Log log = LogFactory.getLog(UserDaoImpl.class);
	private CommonDao  dao=new CommonDao();
	@Override
	public User getById(Integer id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance =(User)dao.getById(User.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean save(User user) {
		log.debug("saving user instance");
		Boolean status = false;
		try {
			dao.save(user);
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
		log.debug("deleting user instance");
		Boolean status = false;
		try {
			dao.delete(User.class, id);
			status = true;
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
		return status;
	}

	@Override
	public Boolean update(User user) {
		log.debug("updating user instance");
		Boolean status = false;
		try {
			dao.update(user);
			log.debug("updatge successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}
	public User login(String name,String pwd){
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		User user = null;
		try {
			String hql = "select a from User as a where a.userName=:loginName and a.userPwd=:loginPwd";
			Query query = session.createQuery(hql);
			query.setString("loginName", name);
			query.setString("loginPwd", pwd);
			query.setMaxResults(1);
			tx = session.beginTransaction();
			user = (User) query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}

}
