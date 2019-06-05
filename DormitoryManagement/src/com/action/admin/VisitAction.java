package com.action.admin;

import java.util.Map;
import com.entity.Admin;
import com.entity.Student;
import com.entity.Visit;
import com.interceptor.AdminInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StudentService;
import com.service.VisitService;
import com.serviceImpl.StudentServiceImpl;
import com.serviceImpl.VisitServiceImpl;
import com.tool.PageBean;

public class VisitAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int page;
	private Integer visitId;
	private Visit visit;
	private VisitService visitService=new VisitServiceImpl();
	private StudentService stuService=new StudentServiceImpl();
	private String stuNum;
	private Student student;
		
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Integer getVisitId() {
		return visitId;
	}
	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}
	public Visit getVisit() {
		return visit;
	}
	public void setVisit(Visit visit) {
		this.visit = visit;
	}
	
	/**
	 *����������
	 * @param  stuNum  ѧ��ѧ��
	*/
	public String save() throws Exception{
		Map session=ActionContext.getContext().getSession();
		Admin admin=null;
		admin =(Admin)session.get(AdminInterceptor.ADMIN_SESSION_KEY);
		student=stuService.getByNum(stuNum);
		visitService.save(visit, admin, student);
		return "success";
	}
	
	/**
	 *ɾ����������Ϣ
	*/
	public String delete() throws Exception {
		if (visitService.delete(visitId)) {
			return "success";
		}else{
			this.addActionMessage("ɾ��ʧ��");
	    	return "error";
		}
	}

	/**
	 *������������Ϣ
	*/
	public String update() throws Exception {
		Map session=ActionContext.getContext().getSession();
		Admin admin=null;
		admin =(Admin)session.get(AdminInterceptor.ADMIN_SESSION_KEY);
		student=stuService.getByNum(stuNum);
		if (visitService.update(visit, admin, student)) {
			return "success";
		}else{
			this.addActionMessage("����ʧ��");
			return "error";
		}
	}

	public String edit() throws Exception {
		visit =visitService.getById(visitId);
		return "edit";
	}
	
	/**
	 *��ѯ��������Ϣ
	*/
	public String find() throws Exception {
		// ��ʾÿҳ��ʾ5����¼��page��ʾ��ǰ��ҳ
		PageBean pageBean = visitService.getPageBean(9,page);
        Map session=ActionContext.getContext().getSession();
 	    session.put("visPage", pageBean);
        return "success";
	}

}
