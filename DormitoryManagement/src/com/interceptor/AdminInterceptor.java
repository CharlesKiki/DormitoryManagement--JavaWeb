package com.interceptor;

import java.util.Map;

import com.entity.Admin;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;
//用户登录验证

public class AdminInterceptor extends ActionSupport  implements Interceptor {

	 private static final long serialVersionUID = 1L;
	 
	 public static final String ADMIN_SESSION_KEY = "UserSessionKey";
	 
	 public void destroy() {}

	 public void init() {}

     public String intercept(ActionInvocation actionInvocation) throws Exception {
		 //取得Session
         Map session = actionInvocation.getInvocationContext().getSession();
		 //从Session里获得登录时保存进session的User类
         Admin admin1= (Admin) session.get(ADMIN_SESSION_KEY);
         //如果用户为空，返回登录页面  	 
         if (admin1==null) {
        	  return Action.INPUT;           
         }        
         return actionInvocation.invoke();//返回验证通过         
    }

}