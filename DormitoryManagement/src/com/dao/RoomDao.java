package com.dao;

import java.util.List;

import com.entity.Apartment;
import com.entity.Room;


public interface RoomDao {
   
	public Room getById(Integer id);
	
	public Boolean save(Room room,Apartment apartment);
	
	public Boolean delete(Integer id);
	
	public Boolean update(Room room,Apartment apartment);
	
	public List<Room> find();

}
