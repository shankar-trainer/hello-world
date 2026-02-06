package solid.srp.incorrect;

import java.io.FileWriter;
import java.io.IOException;

public class User {
    private int userId;
    private  String  userName;
    private  float salary;

    public User(int userId, String userName, float salary) {
        this.userId = userId;
        this.userName = userName;
        this.salary = salary;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public float getSalary() {
        return salary;
    }

    public void writeDataToFile() throws IOException {
        FileWriter fileWriter=new FileWriter(userName+".txt");
        fileWriter.write("\nname is "+getUserName());
        fileWriter.write("\nid is "+getUserName());
        fileWriter.write("\nsalary is "+getSalary());
    }
}
