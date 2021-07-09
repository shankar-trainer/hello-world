package cts.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesPrg2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties=new Properties();
		properties.load(new FileInputStream("user.properties"));
		
		Set<Object> keySet = properties.keySet();
		
		for (Object object : keySet) {
			System.out.println(object+"  "+properties.get(object));
		}
	}
}
