package com.entity;

/**
 * Apartment entity. @author MyEclipse Persistence Tools
 */

public class Apartment implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer apartId;
	private String apartName;
	private String apartNum;
	private String apartNote;
	private Admin admin;

	// Constructors

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	/** default constructor */
	public Apartment() {
	}

	// Property accessors

	public Integer getApartId() {
		return this.apartId;
	}

	public void setApartId(Integer apartId) {
		this.apartId = apartId;
	}

	public String getApartName() {
		return this.apartName;
	}

	public void setApartName(String apartName) {
		this.apartName = apartName;
	}

	public String getApartNum() {
		return this.apartNum;
	}

	public void setApartNum(String apartNum) {
		this.apartNum = apartNum;
	}

    public String getApartNote() {
		return this.apartNote;
	}

	public void setApartNote(String apartNote) {
		this.apartNote = apartNote;
	}

}