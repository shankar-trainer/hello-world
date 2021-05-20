package com.cts.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ApplicationUtil {
    
    public static Date  convertUtilToSqlDate(java.util.Date date) {
	  
	  return   new Date(date.getTime());
	  
  }
    
    public static Date  checkDateFormat(String s) throws ParseException {
    	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
    	
    	java.util.Date parse = dateFormat.parse(s);
    	
    	return   convertUtilToSqlDate(parse);
    	
    }
}
