package solid.srp.incorrect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class User {

    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        // java mail
        return email;
    }
    public void saveToFile() throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(name+".txt");
        fileOutputStream.write("user values ".getBytes());
        fileOutputStream.write(("\nid is "+id).getBytes());
        fileOutputStream.write(("\nname is "+name).getBytes());
        System.out.println("user information is saved in the file");
    }
}
