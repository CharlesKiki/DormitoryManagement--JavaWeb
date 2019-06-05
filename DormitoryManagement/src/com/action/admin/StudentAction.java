package com.action.admin;

import java.util.Map;
import com.entity.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StudentService;
import com.serviceImpl.StudentServiceImpl;
import com.tool.PageBean;

public class StudentAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
    private Student student;
    private Integer stuId;
    private String stuNum;
    private int page;
    private StudentService stuService=new StudentServiceImpl();
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String save() throws Exception{
		stuService.save(student);
		return "success";
	}
		
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	/**
	 * ����ѧ��ѧ��ɾ��ѧ��
	 * @param  stuId  ѧ��ѧ��
	*/
	public String delete() throws Exception {
		if (stuService.delete(stuId)) {
			return "success";
		}else{
			this.addActionMessage("ɾ��ʧ��");
	    	return "error";
		}
	}

	/**
	 * ����ѧ����Ϣ
	*/
	public String update() throws Exception {
		if (stuService.update(student)) {
			return "success";
		}else{
			this.addActionMessage("����ʧ��");
			return "error";
		}
	}
	/**
	 * ����ѧ��ѧ�Ż�ȡѧ��
	 * @param  stuId  ѧ��ѧ��
	*/
	public String edit() throws Exception {
		student =stuService.getById(stuId);
		return "edit";
	}
	
	/**
	 * ����ѧ��ѧ�Ż�ȡѧ��
	 * @param  stuId  ѧ��ѧ��
	*/
	public String detail() throws Exception{
		student =stuService.getById(stuId);
		return "detail";
		
	}
	
	public String findByNum() throws Exception{
		student =stuService.getByNum(stuNum);
		return "detail";
		
	}
	/**
	 * ��ȡ����ѧ����Ϣ
	*/
	public String find() throws Exception {
		// ��ʾÿҳ��ʾ5����¼��page��ʾ��ǰ��ҳ
		PageBean pageBean = stuService.getPageBean(9,page);
        Map session=ActionContext.getContext().getSession();
 	    session.put("stuPage", pageBean);
        return "success";
	}
}
