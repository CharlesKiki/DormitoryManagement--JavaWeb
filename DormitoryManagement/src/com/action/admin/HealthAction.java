package com.action.admin;

import java.util.List;
import java.util.Map;
import com.entity.Health;
import com.entity.Room;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.HealthService;
import com.service.RoomService;
import com.serviceImpl.HealthServiceImpl;
import com.serviceImpl.RoomServiceImpl;
import com.tool.PageBean;

public class HealthAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private int page;
	private Integer healthId;
	private Health health;
	private Integer roomId;
	private List<Room> roomList;
	private HealthService healthService=new HealthServiceImpl();
	private RoomService roomService=new RoomServiceImpl();
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public Integer getHealthId() {
		return healthId;
	}
	public void setHealthId(Integer healthId) {
		this.healthId = healthId;
	}
	public Health getHealth() {
		return health;
	}
	public void setHealth(Health health) {
		this.health = health;
	}
		
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public List<Room> getRoomList() {
		return roomList;
	}
	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}
	
	
	/**
	 *增加寝室卫生信息
	 * @param  roomId  房间Id
	*/
	public String save() throws Exception{
		Room room=null;
		room=roomService.getById(roomId);
		healthService.save(health, room);
		return "success";
	}
	
	/**
	 *删除寝室卫生信息
	*/
	public String delete() throws Exception {
		if (healthService.delete(healthId)) {
			return "success";
		}else{
			this.addActionMessage("删除失败");
	    	return "error";
		}
	}

	/**
	 *更新寝室卫生信息
	 * @param  roomId  房间Id
	*/
	public String update() throws Exception {
		Room room=null;
		room=roomService.getById(roomId);
		if (healthService.update(health, room)) {
			return "success";
		}else{
			this.addActionMessage("更新失败");
			return "error";
		}
	}

	/**
	 *获取房间列表、卫生信息，以便更新
	*/
	public String edit() throws Exception {
		health =healthService.getById(healthId);
		roomList=roomService.find();
		return "edit";
	}
	
	/**
	 *获取房间列表
	*/
	public String addHealth() throws Exception {
		roomList=roomService.find();
		return "success";
	}
	
	/**
	 *查询寝室卫生信息
	*/
	public String find() throws Exception {
		// 表示每页显示5条记录，page表示当前网页
		PageBean pageBean = healthService.getPageBean(9,page);
        Map session=ActionContext.getContext().getSession();
 	    session.put("healthPage", pageBean);
        return "success";
	}

	

}
