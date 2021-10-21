package org.com.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MapnProperty1 {

	public static void main(String[] args) {
		
		Map  map1=new HashMap();
		
		map1.put(123, "hello");
		
		Properties properties=new Properties();
		properties.put(123, 5678);
		System.out.println(properties.get(123));
		//properties.load(inStream);
		//properties.save(out, comments);
		properties.keys();
		properties.values();
		
	}
	
	
}
