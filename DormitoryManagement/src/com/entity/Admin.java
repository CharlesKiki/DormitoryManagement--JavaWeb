package com.entity;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer adminId;
	private String adminName;
	private String adminPwd;
	private Integer adminPow;
	private Manager manager;

	// Constructors

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(String adminName, String adminPwd, Integer adminPow) {
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.adminPow = adminPow;
	}

	// Property accessors

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPwd() {
		return this.adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public Integer getAdminPow() {
		return this.adminPow;
	}

	public void setAdminPow(Integer adminPow) {
		this.adminPow = adminPow;
	}

}