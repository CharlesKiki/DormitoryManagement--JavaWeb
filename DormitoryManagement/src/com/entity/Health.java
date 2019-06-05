package com.entity;

import java.util.Date;

/**
 * Health entity. @author MyEclipse Persistence Tools
 */

public class Health implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Room room;
	private String health;
	private Date checkDate;

	// Constructors

	/** default constructor */
	public Health() {
	}

   // Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getHealth() {
		return this.health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

}