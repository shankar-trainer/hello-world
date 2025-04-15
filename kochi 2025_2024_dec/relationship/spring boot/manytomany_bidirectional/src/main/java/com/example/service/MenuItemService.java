package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.MenuItem;
import com.example.repository.MenuItemRepository;

@Service
public class MenuItemService {
    @Autowired
    private MenuItemRepository menuItemRepository;
 
    public MenuItem addMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }
 
    public List<MenuItem> getMenuByRestaurantID(int restaurantID) {
        return menuItemRepository.findByRestaurantID(restaurantID);
    }
 
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }
 
    public void deleteMenuItem(int itemID) {
        menuItemRepository.deleteById(itemID);
    }
}