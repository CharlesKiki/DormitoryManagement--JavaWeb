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

public class UserInfoAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();
	private StudentService stuService=new StudentServiceImpl();
	private User user;
	private Integer stuId;
	private String userName;
	private String userPwd;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String edit() throws Exception {
		Map session=ActionContext.getContext().getSession();
		user =(User)session.get(UserInterceptor.USER_SESSION_KEY);
		stuId=user.getUserId();
		return "edit";
	}
	
	public String update() throws Exception {
//		Map session=ActionContext.getContext().getSession();
//		User user1=(User)session.get(UserInterceptor.USER_SESSION_KEY);
//		user1.setUserName(user.getUserName());
//		user1.setUserPwd(user.getUserPwd());
		User user1=userService.getById(stuId);
		Student student=stuService.getById(stuId);
		user1.setUserName(userName);
		user1.setUserPwd(userPwd);
		user1.setStudent(student);
		if (userService.update(user1)) {
			return "success";
		}else{
			this.addActionMessage("¸üÐÂÊ§°Ü");
			return "error";
		}
	}
	
	}
