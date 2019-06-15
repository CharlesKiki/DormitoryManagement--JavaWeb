package com.action.user;

//Map类型是Session容器的类型
import java.util.Map;

/*实体对象用来完成接受表单数据*/
import com.entity.Admin;
import com.entity.User;

import com.interceptor.AdminInterceptor;
import com.interceptor.UserInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

//引入Service接口
import com.service.UserService;
//引入接口实现
import com.serviceImpl.UserServiceImpl;
/* 
	权限：用户
	功能：登陆行为或者注销的业务逻辑
	注释：Session的设计是由Map容器完成的
	这个类中的User属性不针对任何一个用户，每个请求都从这里完成业务逻辑
*/
//注意这个继承，这个继承是Struts2的框架类型
public class UserAction extends ActionSupport{

	/* 
		为什么这里需要序列化？
		该类的工作机制：每当一个主机浏览器登陆请求来到，就会触发这个类
		UserService对象用来接收来自主机的数据
		User对象用来标识当前通信中的服务对象，用来更新当前Session上下文
		UserService提供了User对象的可用动作，例如请求登陆中的数据库访问
	*/
	private static final long serialVersionUID = 1L;
	//定义表单数据对象User 注意，这里没有实例化，使用了
	private User user;
	//定义处理登陆业务类
	private UserService userService=new UserServiceImpl();
	
	/* 对象属性初始化 
	注释：实际上来及JSP的form中已经被初始化一个user对象了，并且该对象包含有用户名和密码
	？？？这两个方法是什么在什么地方调用了？？？什么时候初始化的？？？
	这两个方法必须存在，但是调用过程是Struts2内部的API自动实现了
	*/
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

	/*??????*/
	public String login()throws Exception{
		//每次调用该方法都会初始化被user1，这是一个用来赋值form表单对象的中间变量
		User user1=null;
		//检查用户名和密码
		/* 非常有趣的一点，实际上，即便对象的方法没有出现在当前的源码文件中，
		依然是可以使用这个方法的。虽然初次阅读源码时会不知所措 
		JVM有独特的初始化过程
		*/
		user1=userService.login(user.getUserName(),user.getUserPwd());
		if(user1!=null){
			// 初始化当前Session上下文
			 Map session=ActionContext.getContext().getSession();
			 //奇怪，UserInterceptor没有被实例化？这是静态访问？
	        session.put(UserInterceptor.USER_SESSION_KEY,user1);
	       	return "success";
		}else{
			this.addActionMessage("??????????????");
			return "error";
		}
		
	}
	/*??????*/
	public String loginOut() throws Exception{
		Map session=ActionContext.getContext().getSession();
		User user1 =(User)session.get(UserInterceptor.USER_SESSION_KEY);
         //???????????????????  	 
         if (user1!=null) {
        	 session.remove(UserInterceptor.USER_SESSION_KEY);
        	 this.addActionMessage("?????");        
         }  
         return "loginOut";
	}
	//很奇怪，没有execute()方法
	

}
