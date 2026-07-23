package com.coforge.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LiteratureBook  extends Book{
	
	@Override
	public void bookInfo() {
	System.out.println("LiteratureBook ...");	
	}

}
