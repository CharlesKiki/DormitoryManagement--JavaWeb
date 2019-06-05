package com.action.admin;

import java.util.List;
import java.util.Map;

import com.entity.Room;
import com.entity.Stubase;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;
import com.service.StubaseService;
import com.serviceImpl.RoomServiceImpl;
import com.serviceImpl.StubaseServiceImpl;
import com.tool.PageBean;

public class StubaseAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Integer stubaseId;
	private Stubase stubase;
	private StubaseService stubaseService=new StubaseServiceImpl();
	private RoomService roomService=new RoomServiceImpl();
	private List<Room> roomList;
	private Integer roomId;
	private int page;
	public Integer getStubaseId() {
		return stubaseId;
	}
	public void setStubaseId(Integer stubaseId) {
		this.stubaseId = stubaseId;
	}
	public Stubase getStubase() {
		return stubase;
	}
	public void setStubase(Stubase stubase) {
		this.stubase = stubase;
	}
		
	public List<Room> getRoomList() {
		return roomList;
	}
	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = Integer.parseInt(roomId);
	}
		
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	/**
	 *ɾ��ѧ��ס����Ϣ
	*/
	public String delete() throws Exception {
		if (stubaseService.delete(stubaseId)) {
			return "success";
		}else{
			this.addActionMessage("ɾ��ʧ��");
	    	return "error";
		}
	}

	/**
	 *����ѧ��ס����Ϣ
	*/
	public String update() throws Exception {
		Room room=null;
		room=roomService.getById(roomId);
		stubase.setRoom(room);
		if (stubaseService.update(stubase)) {
			return "success";
		}else{
			this.addActionMessage("����ʧ��");
			return "error";
		}
	}

	public String edit() throws Exception {
		stubase =stubaseService.getById(stubaseId);
		roomList=roomService.find();
		return "edit";
	}
	
	/**
	 *��ѯѧ��ס����Ϣ
	*/
	public String find() throws Exception {
		// ��ʾÿҳ��ʾ5����¼��page��ʾ��ǰ��ҳ
		PageBean pageBean = stubaseService.getPageBean(9,page);
        Map session=ActionContext.getContext().getSession();
 	    session.put("stubasePage", pageBean);
        return "success";
	}
	

}
