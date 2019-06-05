package com.entity;

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer manId;
	private String manName;
	private String manPhone;
	private String manEmail;
	private String note;

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** full constructor */
	public Manager(String manName, String manPhone, String manEmail, String note) {
		this.manName = manName;
		this.manPhone = manPhone;
		this.manEmail = manEmail;
		this.note = note;
	}

	// Property accessors

	public Integer getManId() {
		return this.manId;
	}

	public void setManId(Integer manId) {
		this.manId = manId;
	}

	public String getManName() {
		return this.manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public String getManPhone() {
		return this.manPhone;
	}

	public void setManPhone(String manPhone) {
		this.manPhone = manPhone;
	}

	public String getManEmail() {
		return this.manEmail;
	}

	public void setManEmail(String manEmail) {
		this.manEmail = manEmail;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}