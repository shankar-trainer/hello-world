package solid.srp.correct;

import java.io.FileOutputStream;
import java.io.IOException;

public class UserFileManger {

    public void saveToFile(User user) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(user.getName()+".txt");
        fileOutputStream.write("user values ".getBytes());
        fileOutputStream.write(("\nid is "+user.getId()).getBytes());
        fileOutputStream.write(("\nname is "+user.getName()).getBytes());
        System.out.println("user information is saved in the file");
    }
}

class UserMain{
    public static void main(String[] args) {
    User user=new User(199909,"sunil kumar","sunil@gmail.com");
        System.out.println();

        System.out.println("\t id "+user.getId());
        System.out.println("\t name "+user.getId());
        System.out.println("\nemail operation");
        System.out.println("\t email "+user.getEmail());

        UserFileManger manager=new UserFileManger();
        try {
            manager.saveToFile(user);
        }
        catch (IOException e){
            System.err.println(e);
        }

    }
}