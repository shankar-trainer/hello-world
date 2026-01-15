package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        try {
            InetAddress address=InetAddress.getLocalHost();
            System.out.println(address);

            InetAddress address1=InetAddress.getByName("www.cognizant.com");
            System.out.println(address1);

            InetAddress address2[]=InetAddress.getAllByName("www.google.com");

            Stream.of(address2).forEach(a-> System.out.println(a));

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
    }
}
