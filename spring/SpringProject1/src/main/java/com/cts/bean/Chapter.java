package com.cts.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Chapter {
    private int pageNo;
    private String chapterName;

    @PostConstruct
    public void init() {
        this.pageNo=1;
        this.chapterName="basic to spring";
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "pageNo=" + pageNo +
                ", chapterName='" + chapterName + '\'' +
                '}';
    }
}
