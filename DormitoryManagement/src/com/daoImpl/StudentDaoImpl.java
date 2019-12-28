package com.daoImpl;

import com.dao.StudentDao;
import com.entity.Stubase;
import com.entity.Student;
import com.entity.User;
import com.tool.CommonDao;
import com.util.HibernateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDaoImpl implements StudentDao {
	private static final Log log = LogFactory.getLog(StudentDaoImpl .class);
	private CommonDao  dao=new CommonDao();
	@Override
	public Student getById(Integer id) {
		log.debug("getting student instance with id: " + id);
		try {
			Student instance =(Student)dao.getById(Student.class,id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Boolean save(Student student) {
		log.debug("saving Student instance");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		try {
			tx = session.beginTransaction();
			User user=new User();
			user.setUserName(student.getStuNum());
			user.setUserPwd("123456");
			user.setStudent(student);
			Stubase stubase=new Stubase();
			stubase.setStudent(student);
			dao.save(student);
			dao.save(user);
			dao.save(stubase);
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
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		Boolean status = false;
		Student student = null;
		Stubase stubase=null;
		User user=null;
		try {
			tx = session.beginTransaction();
			student = (Student)session.get(Student.class,id);
			stubase=(Stubase)session.get(Stubase.class, id);
			user=(User)session.get(User.class,id);
			session.delete(student);
			if(user!=null){
				session.delete(user);
			}
			if(stubase!=null){
				session.delete(stubase);
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
	public Boolean update(Student student) {
		log.debug("updating User instance");
		Boolean status = false;
		try {
			dao.update(student);
			log.debug("update successful");
			status = true;
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		return status;
	}
	
	public Student getByNum(String stuNum){
		log.debug("get Student instance by stuNum");
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Student student = null;
		Transaction tx = null;
		String hql="from Student as s where s.stuNum=:stuNum";
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("stuNum", stuNum);
			student=(Student)query.uniqueResult();
			tx.commit();
					
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			util.closeSession(session);
		}
		return student;
	}

}
