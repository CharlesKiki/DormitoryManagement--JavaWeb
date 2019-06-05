package com.entity;

import java.util.Date;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer stuId;
	private String stuNum;
	private String stuName;
	private String sex;
	private String sbj;
	private String stuMajor;
	private String stuCollege;
	private String ssfz;
	private Date stuEnter;
	private Date stuBirth;
	private String stuPhone;
	private String stuAddress;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String stuNum, String stuName, String sex, String sbj,
			String stuMajor, String stuCollege, String ssfz, Date stuEnter,
			Date stuBirth, String stuPhone, String stuAddress) {
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.sex = sex;
		this.sbj = sbj;
		this.stuMajor = stuMajor;
		this.stuCollege = stuCollege;
		this.ssfz = ssfz;
		this.stuEnter = stuEnter;
		this.stuBirth = stuBirth;
		this.stuPhone = stuPhone;
		this.stuAddress = stuAddress;
	}

	// Property accessors

	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuNum() {
		return this.stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSbj() {
		return this.sbj;
	}

	public void setSbj(String sbj) {
		this.sbj = sbj;
	}

	public String getStuMajor() {
		return this.stuMajor;
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}

	public String getStuCollege() {
		return this.stuCollege;
	}

	public void setStuCollege(String stuCollege) {
		this.stuCollege = stuCollege;
	}

	public String getSsfz() {
		return this.ssfz;
	}

	public void setSsfz(String ssfz) {
		this.ssfz = ssfz;
	}

	public Date getStuEnter() {
		return this.stuEnter;
	}

	public void setStuEnter(Date stuEnter) {
		this.stuEnter = stuEnter;
	}

	public Date getStuBirth() {
		return this.stuBirth;
	}

	public void setStuBirth(Date stuBirth) {
		this.stuBirth = stuBirth;
	}

	public String getStuPhone() {
		return this.stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public String getStuAddress() {
		return this.stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

}