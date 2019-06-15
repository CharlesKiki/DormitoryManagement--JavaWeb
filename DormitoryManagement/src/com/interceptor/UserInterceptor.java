package com.interceptor;

import java.util.Map;

import com.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;
//用户登录验证

/* 注意，这是一个拦截器，相关概念是AOP编程
这是一种不明显的机制，

*/
public class UserInterceptor extends ActionSupport  implements Interceptor {

	 private static final long serialVersionUID = 1L;
	 
	 public static final String USER_SESSION_KEY = "SessionKey";
	 
	 public void destroy() {}

	 public void init() {}

     public String intercept(ActionInvocation actionInvocation) throws Exception {
		 //取得Session
         Map session = actionInvocation.getInvocationContext().getSession();
       //从Session里获得登录时保存进session的User类
       //这里出现了一次强制类型转换
         User user1= (User) session.get(USER_SESSION_KEY);
         //如果用户为空，返回登录页面  	 
         if (user1==null) {
        	 
            return Action.INPUT;           
         }        
         return actionInvocation.invoke();//返回验证通过         
    }

	
}