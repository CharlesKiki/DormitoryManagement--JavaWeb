package com.service;

import java.util.List;

import com.entity.Apartment;
import com.entity.Room;
import com.tool.PageBean;

public interface RoomService {
	
	public PageBean getPageBean(int pageSize, int page);

	public Boolean save(Room room,Apartment apartment);

	public Boolean delete(Integer id);

	public Boolean update(Room room,Apartment apartment);

	public Room getById(Integer id);
	
	public List<Room> find();

}
