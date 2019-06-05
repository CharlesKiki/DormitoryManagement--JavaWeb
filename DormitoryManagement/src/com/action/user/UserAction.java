package com.action.user;

import java.util.Map;

import com.entity.Admin;
import com.entity.User;
import com.interceptor.AdminInterceptor;
import com.interceptor.UserInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
import com.serviceImpl.UserServiceImpl;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private User user;
	private UserService userService=new UserServiceImpl();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	/*ѧ����¼*/
	public String login()throws Exception{
		User user1=null;
		user1=userService.login(user.getUserName(),user.getUserPwd());
		if(user1!=null){
	 	    Map session=ActionContext.getContext().getSession();
	        session.put(UserInterceptor.USER_SESSION_KEY,user1);
	       	return "success";
		}else{
			this.addActionMessage("�û������������");
			return "error";
		}
		
	}
	/*ѧ��ע��*/
	public String loginOut() throws Exception{
		Map session=ActionContext.getContext().getSession();
		User user1 =(User)session.get(UserInterceptor.USER_SESSION_KEY);
         //����û�Ϊ�գ����ص�¼ҳ��  	 
         if (user1!=null) {
        	 session.remove(UserInterceptor.USER_SESSION_KEY);
        	 this.addActionMessage("��ע��");        
         }  
         return "loginOut";
	}
	
	

}
