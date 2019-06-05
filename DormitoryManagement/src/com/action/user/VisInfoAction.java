package com.action.user;

import java.util.Map;

import com.entity.User;
import com.interceptor.UserInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.VisitService;
import com.serviceImpl.VisitServiceImpl;
import com.tool.PageBean;

public class VisInfoAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private int page;
	private VisitService visitService=new VisitServiceImpl();
	private User user;
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}

	/**
	 *查询学生来访者信息
	*/
	public String find() throws Exception {
		// 表示每页显示5条记录，page表示当前网页
		Map session=ActionContext.getContext().getSession();
        user =(User)session.get(UserInterceptor.USER_SESSION_KEY);
		Integer stuId=user.getUserId();
		PageBean pageBean = visitService.getPageBean1(8,page,stuId);
 	    session.put("visPage", pageBean);
        return "success";
	}
	
	

}
