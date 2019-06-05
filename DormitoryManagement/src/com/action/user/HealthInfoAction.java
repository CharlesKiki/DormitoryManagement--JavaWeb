package com.action.user;

import java.util.Map;

import com.entity.Stubase;
import com.entity.User;
import com.interceptor.UserInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.HealthService;
import com.service.RoomService;
import com.service.StubaseService;
import com.serviceImpl.HealthServiceImpl;
import com.serviceImpl.RoomServiceImpl;
import com.serviceImpl.StubaseServiceImpl;
import com.tool.PageBean;

public class HealthInfoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private int page;
	private User user;
	private HealthService healthService=new HealthServiceImpl();
	private StubaseService stubaseService=new StubaseServiceImpl();
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	/**
	 *��ѯѧ������������Ϣ
	*/
	public String find() throws Exception {
		// ��ʾÿҳ��ʾ5����¼��page��ʾ��ǰ��ҳ
		Map session=ActionContext.getContext().getSession();
        user =(User)session.get(UserInterceptor.USER_SESSION_KEY);
        Stubase stubase=new Stubase();
		Integer stuId=user.getUserId();
		stubase=stubaseService.getById(stuId);
		Integer roomId=stubase.getRoom().getRoomId();
		PageBean pageBean = healthService.getPageBean1(8,page,roomId);
 	    session.put("healthPage", pageBean);
        return "success";
	}
	
}
