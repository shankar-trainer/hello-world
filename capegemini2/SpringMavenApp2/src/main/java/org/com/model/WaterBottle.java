package org.com.model;

public class WaterBottle {

	private int wb_id;
	private String wb_color;
	private String wb_type;
	
	public int getWb_id() {
		return wb_id;
	}
	public void setWb_id(int wb_id) {
		this.wb_id = wb_id;
	}
	public String getWb_color() {
		return wb_color;
	}
	public void setWb_color(String wb_color) {
		this.wb_color = wb_color;
	}
	public String getWb_type() {
		return wb_type;
	}
	public void setWb_type(String wb_type) {
		this.wb_type = wb_type;
	}
	@Override
	public String toString() {
		return "WaterBottle [wb_id=" + wb_id + ", wb_color=" + wb_color + ", wb_type=" + wb_type + "]";
	}
		
	
	
}
