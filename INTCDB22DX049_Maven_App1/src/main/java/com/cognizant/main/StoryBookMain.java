package com.cognizant.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Story;
import com.cognizant.model.StoryBook;

public class StoryBookMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		StoryBook storyBook = ctx.getBean(StoryBook.class);

		System.out.println("story book information");
		System.out.println("id " + storyBook.getBookId());
		System.out.println("name " + storyBook.getBookName());
		System.out.println("cost " + storyBook.getBookCost());

		System.out.println("stories data ");
		for (Story s : storyBook.getStories()) {
			System.out.println("\t"+s.getStoryNo() + "   " + s.getStoryName() + "  " + s.getPageNo());
		}
	}
}
