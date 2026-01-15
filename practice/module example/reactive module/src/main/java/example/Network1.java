package example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network1 {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=InetAddress.getLocalHost();
        System.out.println(inetAddress);
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());

        System.out.println(InetAddress.getByName("www.abc.com"));
    }

}
