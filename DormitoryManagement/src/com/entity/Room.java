package com.entity;

/**
 * Room entity. @author MyEclipse Persistence Tools
 */

public class Room implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer roomId;
	private String dormNum;
	private String floorNum;
	private Apartment apartment;
	private Integer bedNum;
	private Integer staNum;
	private Integer apartId;
	// Constructors

	/** default constructor */
	public Room() {
	}

		// Property accessors

	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getDormNum() {
		return this.dormNum;
	}

	public void setDormNum(String dormNum) {
		this.dormNum = dormNum;
	}

	public String getFloorNum() {
		return this.floorNum;
	}

	public void setFloorNum(String floorNum) {
		this.floorNum = floorNum;
	}

	public Apartment getApartment() {
		return apartment;
	}

	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}

	public Integer getBedNum() {
		return this.bedNum;
	}

	public void setBedNum(Integer bedNum) {
		this.bedNum = bedNum;
	}

	public Integer getStaNum() {
		return this.staNum;
	}

	public void setStaNum(Integer staNum) {
		this.staNum = staNum;
	}

	public Integer getApartId() {
		return apartId;
	}

	public void setApartId(Integer apartId) {
		this.apartId = apartId;
	}
	
	

}