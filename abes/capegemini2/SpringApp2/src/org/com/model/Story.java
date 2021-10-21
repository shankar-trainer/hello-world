package org.com.model;

public class Story {
	
	private String storyTitle;
	private int storyPage;
	
	public Story(){}
	
	public Story(String storyTitle, int storyPage) {
		super();
		this.storyTitle = storyTitle;
		this.storyPage = storyPage;
	}
	@Override
	public String toString() {
		return "Story [storyTitle=" + storyTitle + ", storyPage=" + storyPage
				+ "]";
	}
	
	
	
	
}
