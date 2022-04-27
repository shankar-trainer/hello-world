package com.cognizant.model;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoryBook {

	private int bookId;
	private String bookName;
	private  float  bookCost;
	
	//@Resource
	@Autowired
	private Story[] stories;
	
	@PostConstruct
	public void init() {
		
		this.bookId=898899;
		this.bookName="kids story";
		this.bookCost=1200;
		
		stories=new Story[4];
		
		stories[0]=new Story();
		stories[0].setStoryNo(1);
		stories[0].setStoryName("queeen and king");
		stories[0].setPageNo(5);
		
		
		stories[1]=new Story();
		stories[1].setStoryNo(2);
		stories[1].setStoryName("prince and princess");
		stories[1].setPageNo(10);
		
		
		stories[2]=new Story();
		stories[2].setStoryNo(3);
		stories[2].setStoryName("angry king");
		stories[2].setPageNo(15);
		
		
		stories[3]=new Story();
		stories[3].setStoryNo(4);
		stories[3].setStoryName("king and the monster");
		stories[3].setPageNo(20);
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getBookCost() {
		return bookCost;
	}

	public void setBookCost(float bookCost) {
		this.bookCost = bookCost;
	}

	public Story[] getStories() {
		return stories;
	}

	public void setStories(Story[] stories) {
		this.stories = stories;
	}
	
}
