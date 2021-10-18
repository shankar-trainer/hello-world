package org.com.model;
//package org.com.pl;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Item implements Serializable{
    @Id
    private int item_id;
    private String item_name;
    private float item_cost;
    private int item_qty;
   
    @Override
    public String toString() {
        return "Item{" +
                "item_id=" + item_id +
                ", item_name='" + item_name + '\'' +
                ", item_cost=" + item_cost +
                ", item_qty=" + item_qty +
                '}';
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public float getItem_cost() {
        return item_cost;
    }

    public void setItem_cost(float item_cost) {
        this.item_cost = item_cost;
    }

    public int getItem_qty() {
        return item_qty;
    }

    public void setItem_qty(int item_qty) {
        this.item_qty = item_qty;
    }

    public Item(int item_id, String item_name, float item_cost, int item_qty) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_cost = item_cost;
        this.item_qty = item_qty;
    }
    
    public Item() {
		// TODO Auto-generated constructor stub
	}
}



