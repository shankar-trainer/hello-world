package singleton;

public class UserMain {

    public static void main(String[] args) {
//        User user=new User();

        User user=User.getUser();
        user.setUserId(10001);
        user.setUserName("pawan kumar ");

        User user1=User.getUser();

        System.out.println(user);
        System.out.println(user1);
    }
}
