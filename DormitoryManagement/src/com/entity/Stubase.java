package com.entity;

/**
 * Stubase entity. @author MyEclipse Persistence Tools
 */

public class Stubase implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer stuId;
	private String bedNum;
	private Room  room;
	private Student student;
	// Constructors

	/** default constructor */
	public Stubase() {
	}

	
	// Property accessors

	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getBedNum() {
		return this.bedNum;
	}

	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}


	public Room getRoom() {
		return room;
	}


	public void setRoom(Room room) {
		this.room = room;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}

	

}