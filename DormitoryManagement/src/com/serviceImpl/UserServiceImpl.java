package com.serviceImpl;

import com.dao.UserDao;
import com.daoImpl.UserDaoImpl;
import com.entity.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
	@Override
	public Boolean update(User user) {
		return userDao.update(user);
	}

	@Override
	public User getById(Integer id) {
		return userDao.getById(id);
	}

	@Override
	public User login(String name, String pwd) {
		return userDao.login(name, pwd);
	}

}
