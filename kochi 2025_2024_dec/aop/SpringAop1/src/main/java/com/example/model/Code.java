package com.example.model;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class Code {

	public void display() {
		System.out.println("display called ");
	}
	
}
