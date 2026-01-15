package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class WebClient {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",5000);
            System.out.println("client running ");

            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String s = bufferedReader.readLine();
            System.out.println( "from server "+s);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
