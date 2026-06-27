package designPattern.creational;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Singleton{
static final Logger logger= LogManager.getLogger
        (Singleton.class);

    public static void main(String[] args) {
//        User user=new User();
        User user= User.getUserInstance();
        user.setId(10001);
        user.setName("suresh kumar");

        User user1= User.getUserInstance();
        user1.setId(10002);
        user1.setName("kamlesh kumar");

        System.out.println(user);
        System.out.println(user1);
       // Math m=new Math();
       //Math.E;

    }
}