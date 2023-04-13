package com.abc.io;

import java.io.File;

public class FileProgram {

    public static void main(String[] args) {
        File file=new File("c:\\test");
        String[] list = file.list();
        for (String s:list) {
               if(new File("c:\\test\\"+s).isDirectory())
            System.out.println(s+" : Dir");
               if(new File("c:\\test\\"+s).isFile())
            System.out.println(s+" : File");

        }
    }
}
