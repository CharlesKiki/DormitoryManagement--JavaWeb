package com.action.admin;

import java.util.List;
import java.util.Map;

import com.entity.Admin;
import com.entity.Apartment;
import com.interceptor.AdminInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;
import com.service.ApartmentService;
import com.serviceImpl.AdminServiceImpl;
import com.serviceImpl.ApartmentServiceImpl;
import com.tool.PageBean;

public class ApartmentAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Apartment apartment;
	private int page;
	private Integer apId;
	private List<Admin> adminList;
	private ApartmentService apService=new ApartmentServiceImpl();
	private AdminService adminService=new AdminServiceImpl();
	private Integer adminId;
	
	public List<Admin> getAdminList() {
		return adminList;
	}
	public void setAdminList(List<Admin> adminList) {
		this.adminList = adminList;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public Apartment getApartment() {
		return apartment;
	}
	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Integer getApId() {
		return apId;
	}
	public void setApId(Integer apId) {
		this.apId = apId;
	}
	
	/**
	 * 增加公寓信息
	 * @param  adminId  管理员Id
	*/
	public String save() throws Exception{
		Map session=ActionContext.getContext().getSession();
		Admin admin1=null;
		admin1 =adminService.getById(adminId);
		if (apService.save(apartment,admin1)) {
			return "success";
		}else{
			this.addActionMessage("添加失败");
			return "error";
		}
	}
	
	/**
	 * 删除公寓信息
	 * @param  apId  管理员Id
	*/
	public String delete() throws Exception {
		if (apService.delete(apId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
	}
	/**
	 * 更新公寓信息
	*/
	public String update() throws Exception {
		Map session=ActionContext.getContext().getSession();
		Admin admin1=null;
		admin1 =adminService.getById(adminId);
		if (apService.update(apartment,admin1)){
			return "success";
		}else{
			this.addActionMessage("更新失败");
			return "error";
		}
	}
	
	
	public String addAp() throws Exception {
		adminList=adminService.find();
		return "success";
	}
	
	public String edit() throws Exception {
		apartment =apService.getById(apId);
		adminList=adminService.find();
		return "edit";
	}
	
	/**
	 * 查询所有公寓信息
	*/
	public String find() throws Exception {
		// 表示每页显示5条记录，page表示当前网页
		PageBean pageBean = apService.getPageBean(9,page);
        Map session=ActionContext.getContext().getSession();
 	    session.put("apPage", pageBean);
        return "success";
	}
	

}
