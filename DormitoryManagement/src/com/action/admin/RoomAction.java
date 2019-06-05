package com.action.admin;

import java.util.List;
import java.util.Map;

import com.entity.Admin;
import com.entity.Apartment;
import com.entity.Room;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ApartmentService;
import com.service.RoomService;
import com.serviceImpl.ApartmentServiceImpl;
import com.serviceImpl.RoomServiceImpl;
import com.tool.PageBean;

public class RoomAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private int page;
	private Integer roomId;
	private Room room;
	private Integer apartId;
	private List<Apartment> apartList;
	private RoomService rService=new RoomServiceImpl();
	private ApartmentService apService=new ApartmentServiceImpl();
			
	public Integer getApartId() {
		return apartId;
	}
	public void setApartId(Integer apartId) {
		this.apartId = apartId;
	}
	public List<Apartment> getApartList() {
		return apartList;
	}
	public void setApartList(List<Apartment> apartList) {
		this.apartList = apartList;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	
	/**
	 *���ӷ���
	 * @param  apartId  ����Id
	*/
	public String save() throws Exception{
		Apartment apartment=null;
		apartment=apService.getById(apartId);
		rService.save(room,apartment);
		return "success";
	}
	
	/**
	 *ɾ������
	*/
	public String delete() throws Exception {
		if (rService.delete(roomId)) {
			return "success";
		}else{
			this.addActionMessage("ɾ��ʧ��");
	    	return "error";
		}
	}

	/**
	 *���·���
	*/
	public String update() throws Exception {
		Apartment apartment=null;
		apartment=apService.getById(apartId);
		if (rService.update(room,apartment)) {
			return "success";
		}else{
			this.addActionMessage("����ʧ��");
			return "error";
		}
	}

	public String edit() throws Exception {
		room =rService.getById(roomId);
		apartList=apService.find();
		return "edit";
	}
	
	/**
	 *��ȡ��Ԣ��
	*/
	public String addRoom() throws Exception {
		apartList=apService.find();
		return "success";
	}
	
	/**
	 *��ѯ���з���
	*/
	public String find() throws Exception {
		// ��ʾÿҳ��ʾ5����¼��page��ʾ��ǰ��ҳ
		PageBean pageBean = rService.getPageBean(9,page);
        Map session=ActionContext.getContext().getSession();
 	    session.put("rPage", pageBean);
        return "success";
	}
	

}
