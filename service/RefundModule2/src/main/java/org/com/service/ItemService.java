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
	
	/*
	 * @Override public void run(String... args) throws Exception { Item item = new
	 * Item(10008, "book", 897, 2); //itemService.addItem(item);
	 * 
	 * //itemDao.save(item);
	 * 
	 * //System.out.println("...............item added..................... ");
	 * 
	 * itemDao.findAll().stream().forEach(a->System.out.println(a)); }
	 */
}
