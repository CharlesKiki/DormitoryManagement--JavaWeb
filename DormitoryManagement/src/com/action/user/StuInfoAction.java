package com.action.user;

import java.util.Map;

import com.entity.Student;
import com.entity.User;
import com.interceptor.UserInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StudentService;
import com.service.UserService;
import com.serviceImpl.StudentServiceImpl;
import com.serviceImpl.UserServiceImpl;

public class StuInfoAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private User user;
	private Student student;
	private UserService userService=new UserServiceImpl();
	private StudentService stuService=new StudentServiceImpl();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
		
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String edit() throws Exception {
		Map session=ActionContext.getContext().getSession();
		user =(User)session.get(UserInterceptor.USER_SESSION_KEY);
		Integer stuId=user.getUserId();
		student=stuService.getById(stuId);
		return "edit";
	}
	
	public String update() throws Exception {
		if (userService.update(user)) {
			return "success";
		}else{
			this.addActionMessage("¸üÐÂÊ§°Ü");
			return "error";
		}
	}
	
	}
