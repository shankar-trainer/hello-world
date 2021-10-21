package org.com.model;

public class Story {

	private String storyTitle;
	private int storyPgno;

	@Override
	public String toString() {
		return "Story [storyTitle=" + storyTitle + ", storyPgno=" + storyPgno + "]";
	}

	public Story() {

	}

	public Story(String storyTitle, int storyPgno) {
		super();
		this.storyTitle = storyTitle;
		this.storyPgno = storyPgno;
	}

}
