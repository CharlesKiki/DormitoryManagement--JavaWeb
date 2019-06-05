package com.dao;

import com.entity.Health;
import com.entity.Room;


public interface HealthDao {
	
	    public Health getById(Integer id);
		
		public Boolean save(Health health ,Room room);
		
		public Boolean delete(Integer id);
		
		public Boolean update(Health health ,Room room);

}
