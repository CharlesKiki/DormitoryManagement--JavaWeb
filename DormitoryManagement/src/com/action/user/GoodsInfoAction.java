package com.action.user;

import java.util.Map;

import com.entity.User;
import com.interceptor.UserInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.GoodsService;
import com.serviceImpl.GoodsServiceImpl;
import com.tool.PageBean;

public class GoodsInfoAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int page;
	private User user;
	private GoodsService goodsService=new GoodsServiceImpl();
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
	 *��ѯѧ����Ʒ������Ϣ
	*/
	public String find() throws Exception {
		// ��ʾÿҳ��ʾ5����¼��page��ʾ��ǰ��ҳ
		Map session=ActionContext.getContext().getSession();
        user =(User)session.get(UserInterceptor.USER_SESSION_KEY);
		Integer stuId=user.getUserId();
		PageBean pageBean = goodsService.getPageBean1(8,page,stuId);
 	    session.put("goodsPage", pageBean);
        return "success";
	}
}
