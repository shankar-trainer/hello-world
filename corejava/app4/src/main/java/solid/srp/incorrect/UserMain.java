package solid.srp.incorrect;

import java.io.IOException;

public class UserMain {
    public static void main(String[] args) {
        User user=new User(10001,"jayant kumar",20000.89f);

        try {
            user.writeDataToFile();
            System.out.println("user data\n\t id  "+user.getUserId()+"\n\t name "+user.getUserName()+"\t\n salary "+user.getSalary());
            System.out.println("data  written to the file ");

        } catch (IOException e) {
            System.out.println("error "+e.getMessage());
        }

    }
}
