package com.interceptor;

import java.util.Map;

import com.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;
//�û���¼��֤

/* ע�⣬����һ������������ظ�����AOP���
����һ�ֲ����ԵĻ��ƣ�

*/
public class UserInterceptor extends ActionSupport  implements Interceptor {

	 private static final long serialVersionUID = 1L;
	 
	 public static final String USER_SESSION_KEY = "SessionKey";
	 
	 public void destroy() {}

	 public void init() {}

     public String intercept(ActionInvocation actionInvocation) throws Exception {
		 //ȡ��Session
         Map session = actionInvocation.getInvocationContext().getSession();
       //��Session���õ�¼ʱ�����session��User��
       //���������һ��ǿ������ת��
         User user1= (User) session.get(USER_SESSION_KEY);
         //����û�Ϊ�գ����ص�¼ҳ��  	 
         if (user1==null) {
        	 
            return Action.INPUT;           
         }        
         return actionInvocation.invoke();//������֤ͨ��         
    }

	
}