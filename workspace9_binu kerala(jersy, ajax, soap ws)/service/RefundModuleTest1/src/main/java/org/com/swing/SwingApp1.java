package org.com.swing;


import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;

import org.com.model.Item;
import org.springframework.stereotype.Component;
@Component
public class SwingApp1 extends JFrame{

	List<Item> list1;
	List<Item> list2;
	
	public List<Item> getList1() {
		return list1;
	}

	public void setList1(List<Item> list1) {
		this.list1 = list1;
	}

	JTable jTable;
	
	public SwingApp1() {
	list2=getList1();
	Object obj[][];
	jTable=new JTable(4, 4);
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	   add(jTable);
	}
	
	
	
}
