package com.check;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.entity.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StudentService;
import com.serviceImpl.StudentServiceImpl;

public class StuNumCheck1 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String stuNum;
	private StudentService stuService=new StudentServiceImpl();
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String  execute() throws Exception{
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("cache-control", "no-cache"); 
		PrintWriter out = response.getWriter();
		Student student=null;
		student=stuService.getByNum(stuNum);
		if(student!=null){
			out.write("<span style='color:green'>"+stuNum+"可以使用"+"</span>");
		}else {out.write("<span style='color:red'>"+stuNum+"学号不存在！！！"+"</span>");}
		out.flush();
		out.close();
		return null;
	}

}
