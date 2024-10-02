public class Chapter {
    private int chapterNo;
    private String chapterName;
    private int pageNo;

    public Chapter(int chapterNo, String chapterName, int pageNo) {
        this.chapterNo = chapterNo;
        this.chapterName = chapterName;
        this.pageNo = pageNo;
    }

    public int getChapterNo() {
        return chapterNo;
    }

    public String getChapterName() {
        return chapterName;
    }

    public int getPageNo() {
        return pageNo;
    }
}
