package com.cts.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput1 {

    public static void main(String[] args) throws IOException {
        //FileInputStream fileInputStream=new FileInputStream("C:\\Users\\2383505\\IdeaProjects\\test2\\src\\main\\java\\com\\cts\\io\\FilePrg1.java");
        FileInputStream fileInputStream=new FileInputStream("hello.txt");

        int x=fileInputStream.read();
        System.out.println((char)x);

        while((x= fileInputStream.read())!=-1){
            System.out.print((char)x);
        }
    }
}
