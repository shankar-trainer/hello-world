public class UserTest {
    public static void main(String[] args) {
        User user=new User();
        //user.userId=-8789798;
        //user.userName="";
        user.setUserId(100001);
        user.setUserName("subhash kumar");

        System.out.println("user id "+user.getUserId());
        System.out.println("user name "+user.getUserName());

    }
}
