package com.entity;

import java.util.Date;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer goodsId;
	private Student student;
	private String goodsIn;
	private String goodsOut;
	private Date goodsDate;
	private Admin admin;
	private String note;

	// Constructors

	/** default constructor */
	public Goods() {
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getGoodsIn() {
		return this.goodsIn;
	}

	public void setGoodsIn(String goodsIn) {
		this.goodsIn = goodsIn;
	}

	public String getGoodsOut() {
		return this.goodsOut;
	}

	public void setGoodsOut(String goodsOut) {
		this.goodsOut = goodsOut;
	}

	public Date getGoodsDate() {
		return this.goodsDate;
	}

	public void setGoodsDate(Date goodsDate) {
		this.goodsDate = goodsDate;
	}
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}