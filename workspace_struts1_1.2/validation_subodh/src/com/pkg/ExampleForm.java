package com.pkg;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorActionForm;

public class ExampleForm extends ValidatorActionForm 
{		
	//Eigenschaften der Klasse	
	private String name;	
	private int age;	
	//Getter und Setter Methoden	
	public int getAge() 
	{		
		return age;	}	
	public void setAge(int age) 
	{		
		this.age = age;	}	
	public String getName() 
	{		
		return name;	}
	
	public void setName(String name) 
	{		
		this.name = name;	}
	public void reset(ActionMapping mapping,  	HttpServletRequest request) 
	{  	
		//Initialisieren der Eigenschaften 	
		name = "Adam Weisshaupt"; 	
		age = 23;
	}
	
}