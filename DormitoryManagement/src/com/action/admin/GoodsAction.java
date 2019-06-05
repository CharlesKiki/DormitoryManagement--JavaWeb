package com.action.admin;

import java.util.Map;

import com.entity.Admin;
import com.entity.Goods;
import com.entity.Student;
import com.interceptor.AdminInterceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.GoodsService;
import com.service.StudentService;
import com.serviceImpl.GoodsServiceImpl;
import com.serviceImpl.StudentServiceImpl;
import com.tool.PageBean;

public class GoodsAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private int page;
	private Integer goodsId;
	private Goods goods;
	private GoodsService goodsService=new GoodsServiceImpl();
	private StudentService stuService=new StudentServiceImpl();
	private String stuNum;
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
	/**
	 *增加物品出入信息
	 * @param  stuNum  学生学号
	*/
	public String save() throws Exception{
		Map session=ActionContext.getContext().getSession();
		Admin admin=null;
		admin =(Admin)session.get(AdminInterceptor.ADMIN_SESSION_KEY);
		student=stuService.getByNum(stuNum);
		goodsService.save(goods, admin, student);
		return "success";
	}
	
	/**
	 *删除物品出入信息
	*/
	public String delete() throws Exception {
		if (goodsService.delete(goodsId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
	}

	/**
	 *更新物品出入信息
	 * @param  stuNum  学生学号
	*/
	public String update() throws Exception {
		Map session=ActionContext.getContext().getSession();
		Admin admin=null;
		student=stuService.getByNum(stuNum);
		admin =(Admin)session.get(AdminInterceptor.ADMIN_SESSION_KEY);
		if (goodsService.update(goods, admin, student)) {
			return "success";
		}else{
			this.addActionMessage("更新失败");
			return "error";
		}
	}

	public String edit() throws Exception {
		goods =goodsService.getById(goodsId);
		return "edit";
	}
	
	/**
	 *查询物品出入信息
	*/
	public String find() throws Exception {
		// 表示每页显示5条记录，page表示当前网页
		PageBean pageBean = goodsService.getPageBean(9,page);
        Map session=ActionContext.getContext().getSession();
 	    session.put("goodsPage", pageBean);
        return "success";
	}
	

}
