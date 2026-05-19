package com.montran.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Program1 {

	
	public static void main(String[] args) {
		try {
			//Class<?> C = Class.forName("com.montran.reflect.A");
			 A a =new A();
			 Class<?> C=a.getClass();
			 
			//Class<?> C = Class.forName("java.lang.String");
			System.out.println("reflection program");
			System.out.println(C.isLocalClass());
			System.out.println(C.isInterface());
			System.out.println(C.isMemberClass());
			
			System.out.println("class name is "+C.getName());
			Method[] methods = C.getMethods();
			
			System.out.println("Inherited Methods  from Object  are ");
			for (Method method : methods) {
				System.out.println(method.getName()+"    ");
			}
			
			Method[] declaredMethods = C.getDeclaredMethods();
			System.out.println("declared methods in the class");
			for (Method method : declaredMethods) {
				System.out.print(Modifier.isPublic(method.getModifiers())?"public  ":"not public");
				System.out.println(method.getName());
			}
			Constructor<?>[] constructors = C.getConstructors();
			
			for (Constructor<?> constructor : constructors) {
				System.out.println(constructor.getName()+" no of parameter "+constructor.getParameterCount()
						+" modifier "+constructor.getModifiers());
			}
			Field[] fields = C.getFields();
			System.out.println("Fields information ");
			
			for (Field field : fields) {
				System.out.println(field.getName()+"  "+field.getModifiers());
			}
			System.out.println("--------------------");
			for (int i = 0; i < fields.length; i++) {
				if(Modifier.isPublic(fields[i].getModifiers())) {
				System.out.println("public "+fields[i].getName());
				}
			}
		  
			
			
		} 
	//	catch (ClassNotFoundException e)
		catch (Exception e)
		{
			System.err.println(e);
			e.printStackTrace();
		}
	}
}
