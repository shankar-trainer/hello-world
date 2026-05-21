package solid.srp.incorrect;

import java.io.IOException;

public class UserMain {
    public static void main(String[] args) {
        User user=new User(10001,"amit kumar","amit@ymail.com" );

        System.out.println("User information");
        System.out.println("\t id "+user.getId());
        System.out.println("\t name "+user.getId());
        System.out.println("\nemail operation");
        System.out.println("\t email "+user.getEmail());

   try {
       user.saveToFile();
   }
   catch (IOException e){
       System.err.println(e);
   }
    }
}
