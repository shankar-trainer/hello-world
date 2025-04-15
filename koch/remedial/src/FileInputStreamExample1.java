import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample1 {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream=new FileInputStream("hello.txt");
        // read using bytes

        int x=0;

        while((x=inputStream.read())!=-1){
            System.out.print((char)x);
        }

        FileOutputStream fileOutputStream=new FileOutputStream("hello.txt",true);
        fileOutputStream.write("\nthis is remedial session".getBytes());

        fileOutputStream.close();

    }

}
