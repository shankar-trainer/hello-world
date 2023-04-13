package com.abc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileProgram2 {

    public static void main(String[] args) {
        try {
            //FileInputStream inputStream=new FileInputStream("C:/welcome/welcome1/hello1.txt");
            FileInputStream inputStream=new FileInputStream("C:\\Users\\shankar\\IdeaProjects\\JavaProject2\\src\\com\\abc\\io\\FileProgram2.java");
            int x= inputStream.read();

            while(x!=-1){
                System.out.print((char)x);
                x= inputStream.read();
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
