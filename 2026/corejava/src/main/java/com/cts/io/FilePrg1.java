package com.cts.io;

import java.io.File;

public class FilePrg1 {
    public static void main(String[] args) {

        File file = new File("c:\\");
        for (String a : file.list()) {
            File file1=new File("c:\\"+a);
            if (file1.isFile())
                System.out.println(a + " file");

            if (file1.isDirectory())
                System.out.println(a + " dir");

        }

    }
}
