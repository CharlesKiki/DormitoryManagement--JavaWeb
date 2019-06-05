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
	 * ���ӹ�Ԣ��Ϣ
	 * @param  adminId  ����ԱId
	*/
	public String save() throws Exception{
		Map session=ActionContext.getContext().getSession();
		Admin admin1=null;
		admin1 =adminService.getById(adminId);
		if (apService.save(apartment,admin1)) {
			return "success";
		}else{
			this.addActionMessage("���ʧ��");
			return "error";
		}
	}
	
	/**
	 * ɾ����Ԣ��Ϣ
	 * @param  apId  ����ԱId
	*/
	public String delete() throws Exception {
		if (apService.delete(apId)) {
			return "success";
		}else{
			this.addActionMessage("ɾ��ʧ��");
	    	return "error";
		}
	}
	/**
	 * ���¹�Ԣ��Ϣ
	*/
	public String update() throws Exception {
		Map session=ActionContext.getContext().getSession();
		Admin admin1=null;
		admin1 =adminService.getById(adminId);
		if (apService.update(apartment,admin1)){
			return "success";
		}else{
			this.addActionMessage("����ʧ��");
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
	 * ��ѯ���й�Ԣ��Ϣ
	*/
	public String find() throws Exception {
		// ��ʾÿҳ��ʾ5����¼��page��ʾ��ǰ��ҳ
		PageBean pageBean = apService.getPageBean(9,page);
        Map session=ActionContext.getContext().getSession();
 	    session.put("apPage", pageBean);
        return "success";
	}
	

}
