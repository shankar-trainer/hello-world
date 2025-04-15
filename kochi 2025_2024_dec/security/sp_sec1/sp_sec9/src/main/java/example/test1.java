package example;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        int ar[]={1,2,3,4};
        String name="";

        //System.out.println(()->ar);
        System.out.println("hello");
        //List.of(()->name);
        String authority="hello";

       // List.of(()->authority);
        System.out.println(getAuthorities());
        System.out.println();

    }
//
//    String  hello() {
// return         () -> "hello world";
//    }

    private static final String authority="hello";

    public static Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of(()->authority);
    }
}
