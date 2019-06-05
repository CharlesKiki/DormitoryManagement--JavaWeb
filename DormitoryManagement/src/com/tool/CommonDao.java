package com.tool;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.util.HibernateUtil;

public class CommonDao {

	public Object getById(Class clazz,Integer id) {
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Object object = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			object = (Object) session.get(clazz, id);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			util.closeSession(session);
		}
		return object;
	}

	public Boolean save(Object object) {
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		try {
			tx = session.beginTransaction();
			session.save(object);
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

	public Boolean update(Object object) {
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		try {
			tx = session.beginTransaction();
			session.update(object);
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

	public Boolean delete(Class clazz, Integer id) {
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		Object object = null;
		try {
			tx = session.beginTransaction();
			object = session.get(clazz, id);
			session.delete(object);
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

	public Object login(String hql, String name, String password) {
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Object object = null;
		try {
			Query query = session.createQuery(hql);
			query.setString("loginName", name);
			query.setString("loginPwd", password);
			query.setMaxResults(1);
			tx = session.beginTransaction();
			object = (Object) query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return object;
	}

	public List find(String hql) {
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		List list = null;
		try {
			tx = session.beginTransaction();
			list = session.createQuery(hql).list();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			util.closeSession(session);
		}
		return list;
	}

	public PageBean getPageBean(String hql, int pageSize, int page) {
		PageUtil pageUtil = new PageUtil();
		return pageUtil.getPageBean(pageSize, page, hql);
	}
}
