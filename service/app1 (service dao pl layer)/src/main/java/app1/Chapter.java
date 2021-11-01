package app1;

public class Chapter {

	private int pageno;
	private String chapter_name;
	
	
	@Override
	public String toString() {
		return "Chapter [pageno=" + pageno + ", chapter_name=" + chapter_name + "]";
	}
	
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public String getChapter_name() {
		return chapter_name;
	}
	public void setChapter_name(String chapter_name) {
		this.chapter_name = chapter_name;
	}
	
}
