package org.capg;

public class Chapter {

	private int chapterNo;
	private String chapterName;
	private String chapterQuestion;

	public Chapter(int chapterNo, String chapterName, String chapterQuestion) {
		super();
		this.chapterNo = chapterNo;
		this.chapterName = chapterName;
		this.chapterQuestion = chapterQuestion;
	}

	@Override
	public String toString() {
		return "Chapter \n\tchaperNo=" + chapterNo + "\n\tchapterName=" + chapterName + "\n\tchapterQuestion="
				+ chapterQuestion;
	}

}
