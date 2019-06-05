package com.action.admin;

import java.util.Map;
import com.interceptor.AdminInterceptor;
import com.entity.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;
import com.serviceImpl.AdminServiceImpl;

public class AdminAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private Admin admin;
	private Integer adminId;
	private AdminService adminService=new AdminServiceImpl();
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	
	/* ����Ա��¼*/
	public String login()throws Exception{
		Admin admin1=null;
		admin1=adminService.login(admin.getAdminName(),admin.getAdminPwd());
		if(admin1!=null){
	 	    Map session=ActionContext.getContext().getSession();
	        session.put(AdminInterceptor.ADMIN_SESSION_KEY, admin1);
	        return "success";
		}else{
			this.addActionMessage("�û������������");
			return "error";
		}
		
	}
    
	/* ����Աע��*/
	public String loginOut() throws Exception{
		Map session=ActionContext.getContext().getSession();
		Admin admin1 =(Admin)session.get(AdminInterceptor.ADMIN_SESSION_KEY);
         //����û�Ϊ�գ����ص�¼ҳ��  	 
         if (admin1!=null) {
        	 session.remove(AdminInterceptor.ADMIN_SESSION_KEY);
        	 this.addActionMessage("��ע��");        
         }  
         return "loginOut";
	}
}
