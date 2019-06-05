package com.action.admin;

import java.util.Map;

import com.entity.Admin;
import com.entity.Manager;
import com.interceptor.AdminInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ManagerService;
import com.serviceImpl.ManagerServiceImpl;
import com.tool.PageBean;

public class ManagerAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Manager manager;
	private Integer manId;
	private int page;
	private ManagerService manService=new ManagerServiceImpl();
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public Integer getManId() {
		return manId;
	}
	public void setManId(Integer manId) {
		this.manId = manId;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String save() throws Exception{
		manService.save(manager);
		return "success";
	}
	
	public String delete() throws Exception {
		if (manService.delete(manId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
	}

	public String update() throws Exception {
		if (manService.update(manager)) {
			return "success";
		}else{
			this.addActionMessage("更新失败");
			return "error";
		}
	}

	public String edit() throws Exception {
		manager =manService.getById(manId);
		return "edit";
	}
	
	public String find() throws Exception {
		Map session=ActionContext.getContext().getSession();
		Admin admin1 =(Admin)session.get(AdminInterceptor.ADMIN_SESSION_KEY);
		// 表示每页显示5条记录，page表示当前网页
		PageBean pageBean = manService.getPageBean(9,page);
        session.put("manPage", pageBean);
        if(admin1.getAdminPow()==1){
        	 return "success";
        }
        return "power";
	}

}
