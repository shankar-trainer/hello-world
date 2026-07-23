package com.coforge.model;

import org.springframework.stereotype.Component;

@Component
public class ScienceBook extends Book {

	@Override
	public void bookInfo() {
		System.out.println("Science Book ...");
	}

}
