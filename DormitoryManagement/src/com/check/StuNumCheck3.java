package com.check;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.entity.Admin;
import com.entity.User;
import com.interceptor.AdminInterceptor;
import com.interceptor.UserInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class StuNumCheck3 extends ActionSupport{
	/*  用来在网页显示用户名  */
	private static final long serialVersionUID = 1L;
	public String  execute() throws Exception{
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("cache-control", "no-cache"); 
		PrintWriter out = response.getWriter();
		Map session=ActionContext.getContext().getSession();
		User user=new User();
		user=(User)session.get(UserInterceptor.USER_SESSION_KEY);
		out.write(user.getUserName());
		out.flush();
		out.close();
		return null;
	}

}
