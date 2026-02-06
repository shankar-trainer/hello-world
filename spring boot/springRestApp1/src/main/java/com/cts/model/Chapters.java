package com.cts.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

//@Data
@Entity
public class Chapters {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer chapterId;
    private String chapterName;
    private Integer chapterPageNo;

    @Override
    public String toString() {
        return "Chapters{" +
                "chapterId=" + chapterId +
                ", chapterName='" + chapterName + '\'' +
                ", chapterPageNo=" + chapterPageNo +
                '}'+" book "+book;
    }

    @JsonIgnoreProperties("chaptersSet")
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
//    @JoinColumn(name="book_id2")
    private Book book;


    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Integer getChapterPageNo() {
        return chapterPageNo;
    }

    public void setChapterPageNo(Integer chapterPageNo) {
        this.chapterPageNo = chapterPageNo;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
