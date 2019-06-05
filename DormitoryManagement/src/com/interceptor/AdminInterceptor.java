package com.interceptor;

import java.util.Map;

import com.entity.Admin;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;
//�û���¼��֤

public class AdminInterceptor extends ActionSupport  implements Interceptor {

	 private static final long serialVersionUID = 1L;
	 
	 public static final String ADMIN_SESSION_KEY = "UserSessionKey";
	 
	 public void destroy() {}

	 public void init() {}

     public String intercept(ActionInvocation actionInvocation) throws Exception {
		 //ȡ��Session
         Map session = actionInvocation.getInvocationContext().getSession();
		 //��Session���õ�¼ʱ�����session��User��
         Admin admin1= (Admin) session.get(ADMIN_SESSION_KEY);
         //����û�Ϊ�գ����ص�¼ҳ��  	 
         if (admin1==null) {
        	  return Action.INPUT;           
         }        
         return actionInvocation.invoke();//������֤ͨ��         
    }

}