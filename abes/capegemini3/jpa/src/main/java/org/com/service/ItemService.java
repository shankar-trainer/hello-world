package org.com.service;
//package org.com.pl;


import java.util.List;

import org.com.dao.ItemDao;
import org.com.model.Item;
//import org.com.dao.ItemDao;
//import org.com.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component
@Service
// ("itemService")
public class ItemService  
//implements CommandLineRunner
{

	@Autowired
	// @Qualifier("itemDao")
	public ItemDao itemDao;

	public List<Item> getAllItem(){
		return itemDao.findAll();
	}
	
	public void addItem(Item item) {
		itemDao.save(item);
		
	}
	
}
