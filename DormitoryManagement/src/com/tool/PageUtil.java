package com.tool;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.util.HibernateUtil;

public class PageUtil {
	public List queryByPage(String hql, int offset, int pageSize) {
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		List list = null;

		try {
			tx = session.beginTransaction();
			Query query = session.createQuery(hql).setFirstResult(offset)
					.setMaxResults(pageSize);
			list = query.list();
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

	public int getAllRowCount(String hql) {
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSession();
		Transaction tx = null;
		int allRows = 0;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
			allRows = query.list().size();
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}

			e.printStackTrace();
		} finally {
			util.closeSession(session);
		}

		return allRows;
	}

	public PageBean getPageBean(int pageSize, int page,String hql) {
		
		PageBean pageBean = new PageBean();

		int allRows = this.getAllRowCount(hql);

		int totalPage = pageBean.getTotalPages(pageSize, allRows);

		int currentPage = pageBean.getCurPage(page);

		int offset = pageBean.getCurrentPageOffset(pageSize, currentPage);

		List list = this.queryByPage(hql, offset, pageSize);

		pageBean.setList(list);
		
		pageBean.setAllRows(allRows);
		
		pageBean.setCurrentPage(currentPage);
		
		pageBean.setTotalPage(totalPage);

		return pageBean;
	 }

}
