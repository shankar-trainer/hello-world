package com.cts.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite1 {

    public static void main(String[] args) throws IOException {

        FileOutputStream    stream=new FileOutputStream("welcome.txt", true);
        stream.write(10001);

        stream.write("welcome to java".getBytes());
        stream.write("\nwelcome to java".getBytes());

        stream.close();

    }
}
