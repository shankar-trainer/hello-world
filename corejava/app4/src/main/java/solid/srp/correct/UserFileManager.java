package solid.srp.correct;

import java.io.FileWriter;
import java.io.IOException;

public class UserFileManager {

    public void writeDataToFile(User user) throws IOException {
        FileWriter fileWriter=new FileWriter(user.getUserName()+".txt");
        fileWriter.write("\nname is "+user.getUserName());
        fileWriter.write("\nid is "+user.getUserName());
        fileWriter.write("\nsalary is "+user.getSalary());
    }
}
