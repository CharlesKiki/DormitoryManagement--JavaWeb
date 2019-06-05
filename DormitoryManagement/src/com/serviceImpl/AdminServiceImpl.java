package com.serviceImpl;

import java.util.List;

import com.dao.AdminDao;
import com.daoImpl.AdminDaoImpl;
import com.entity.Admin;
import com.service.AdminService;


public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao=new AdminDaoImpl();
	@Override
	public Boolean update(Admin admin) {
		return adminDao.update(admin);
	}

	@Override
	public Admin getById(Integer id) {
		return adminDao.getById(id);
	}

	@Override
	public Admin login(String name, String pwd) {
		return adminDao.login(name, pwd);
	}
	public List<Admin> find(){
		return adminDao.find();
	}
}
