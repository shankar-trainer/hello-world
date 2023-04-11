package com.audintel.date;

import java.util.Date;

public class DateProgram1 {

	public static void main(String[] args) {
  Date date=new Date();
  System.out.println(date);
  
  Date date1=new Date(1000);
  
  System.out.println(date1);
  
  Date date2=new Date(1000l*60*60*24*30);
  System.out.println(date2);
  
  Date date3=new Date((1000l*3600)*(24*365l));
  System.out.println(date3);
  
  System.out.println(date3.after(date1));
  System.out.println(date2.before(date3));


  System.out.println("date "+date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900));
  System.out.println("time "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
  
	}
}
