package com.entity;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String userName;
	private String userPwd;
	private Student student;
	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userName, String userPwd) {
		this.userName = userName;
		this.userPwd = userPwd;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}