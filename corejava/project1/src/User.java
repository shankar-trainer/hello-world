public class User {
    private int id;
    private String name;
    private String college;

    User() {
        System.out.println("default constructor called ");
        id = 10001;
        name = "amit kumar";
    }

    public User(int id, String name, String college) {
        this.id = id;
        this.name = name;
        this.college = college;
    }

    User(int id, String name) {
        System.out.println("overloaded constructor");
        this.id = id;
        this.name = name;
        this.college="niet";
    }

    void userInfo() {
        System.out.println("\nid is " + id);
        System.out.println("name is " + name);
        System.out.println("college is " + college);
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User(10009,"kavita devi");
        User user3 = new User(176767,"kamalkant","gl bajaj college");

        user1.userInfo();
        user2.userInfo();
        user3.userInfo();
    }

}
