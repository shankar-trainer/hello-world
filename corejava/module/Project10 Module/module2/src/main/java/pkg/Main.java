package pkg;
import com.cts.User;
import com.example.Person;

public class Main {

    public static void main(String[] args) {
        User user=new User();
        user.id=90990;
        user.name="kamal kumar";

        System.out.println("id "+user.id);
        System.out.println("name "+user.name);

        Person person=new Person(1001,"harsha");
        System.out.println(person);
    }
}
