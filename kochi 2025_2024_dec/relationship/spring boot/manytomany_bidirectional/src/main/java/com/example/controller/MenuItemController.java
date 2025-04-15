package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.MenuItem;
import com.example.service.MenuItemService;

@RestController
@RequestMapping("/menu")
public class MenuItemController {
    @Autowired
    private MenuItemService menuItemService;
 
    @PostMapping("/add")
    public ResponseEntity<MenuItem> addMenuItem(@RequestBody MenuItem menuItem) {
        MenuItem addedItem = menuItemService.addMenuItem(menuItem);
        return new ResponseEntity<>(addedItem, HttpStatus.CREATED);
    }
 
    @GetMapping("/restaurant/{restaurantID}")
    public ResponseEntity<List<MenuItem>> getMenuByRestaurantID(@PathVariable int restaurantID) {
        List<MenuItem> menuItems = menuItemService.getMenuByRestaurantID(restaurantID);
        return new ResponseEntity<>(menuItems, HttpStatus.OK);
    }
 
    @GetMapping("/all")
    public ResponseEntity<List<MenuItem>> getAllMenuItems() {
        List<MenuItem> menuItems = menuItemService.getAllMenuItems();
        return new ResponseEntity<>(menuItems, HttpStatus.OK);
    }
 
    @DeleteMapping("/{itemID}")
    public ResponseEntity<Void> deleteMenuItem(@PathVariable int itemID) {
        menuItemService.deleteMenuItem(itemID);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}