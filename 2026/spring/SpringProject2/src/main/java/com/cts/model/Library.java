package com.cts.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Library {
    private long libId;
    private String libName;

    public long getLibId() {
        return libId;
    }

    public void setLibId(long libId) {
        this.libId = libId;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libId=" + libId +
                ", libName='" + libName + '\'' +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("init called ");
        this.libId = 889878;
        this.libName = "kids library";
    }

    @PreDestroy
    public void clean() {
        System.out.println("clean called ");
    }
}
