package com.serviceImpl;

import com.dao.StudentDao;
import com.daoImpl.StudentDaoImpl;
import com.entity.Student;
import com.service.StudentService;
import com.tool.PageBean;
import com.tool.PageUtil;

public class StudentServiceImpl implements StudentService {
	private PageUtil pageUtil = new PageUtil();
	private StudentDao stuDao = new StudentDaoImpl();

	@Override
	public PageBean getPageBean(int pageSize, int page) {
		String hql = "from Student";
		return pageUtil.getPageBean(pageSize, page, hql);
	}

	@Override
	public Boolean save(Student student) {

		return stuDao.save(student);
	}

	public Boolean delete(Integer id) {

		return stuDao.delete(id);
	}

	public Boolean update(Student student) {

		return stuDao.update(student);
	}

	public Student getById(Integer id) {
		return stuDao.getById(id);
	}
	public Student getByNum(String stuNum){
		return stuDao.getByNum(stuNum);
	}

}
