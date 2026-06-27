public class User {
    int id;    //attribute, instance variable
    String name;
    String email;

    User(){
        System.out.println("default constructor ");
        this.id=989898;
        this.name="suman kumar";
        this.email="suman@gmail.com";
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.id = 9998;
        user1.name = "kamal kumar";
        user1.email = "kamal@gmail.com";

        System.out.println("user1 ");
        System.out.println(user1.id);
        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println("user2 ");
        System.out.println(user2.id);
        System.out.println(user2.name);
        System.out.println(user2.email);

    }


}
