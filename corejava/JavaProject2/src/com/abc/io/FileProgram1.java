package com.abc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileProgram1 {
    public static void main(String[] args) throws IOException {

        //FileOutputStream fileOutputStream=new FileOutputStream("C:\\welcome\\welcome1\\");
        FileOutputStream fileOutputStream=new FileOutputStream("C:/welcome/welcome1/hello1.txt",true);

         fileOutputStream.write("\nhello world".getBytes());
         fileOutputStream.write("\nhello world".getBytes());

        // fileOutputStream.close();
    }
}
