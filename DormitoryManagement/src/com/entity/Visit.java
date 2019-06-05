package com.entity;

import java.util.Date;

/**
 * Visit entity. @author MyEclipse Persistence Tools
 */

public class Visit implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer visitId;
	private String visitName;
	private Student student;
	private String relation;
	private Date visDate;
	private Date leaDate;
	private Admin admin;
	private String visCret;
	private String note;

	// Constructors

	/** default constructor */
	public Visit() {
	}

	// Property accessors

	public Integer getVisitId() {
		return this.visitId;
	}

	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}

	public String getVisitName() {
		return this.visitName;
	}

	public void setVisitName(String visitName) {
		this.visitName = visitName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Date getVisDate() {
		return this.visDate;
	}

	public void setVisDate(Date visDate) {
		this.visDate = visDate;
	}

	public Date getLeaDate() {
		return this.leaDate;
	}

	public void setLeaDate(Date leaDate) {
		this.leaDate = leaDate;
	}

	public String getVisCret() {
		return this.visCret;
	}

	public void setVisCret(String visCret) {
		this.visCret = visCret;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}