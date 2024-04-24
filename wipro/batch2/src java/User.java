public class User {
    int x; // instance variable
    static int count;// static/class variable
    int y;

    public User() {
        x++;
        count++;
    }

    // instance, static/class variable have default value 0 or null
    // local variable has no default value
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1.x + "   " + count);
        User user2 = new User();
        System.out.println(user2.x + "   " + count);
        User user3 = new User();
        System.out.println(user2.x + "   " + count);
        User user4 = new User();
        System.out.println(user4.x + "   " + count);
        int p;  // local variable has no default value
        p = 0;
        System.out.println(p);
        System.out.println(user1.y);
    }
}


/*
user1  -- separate  copy  of x initialised with 0 incremented to 1
user1  -- shared copy of count initialised with 0 incremented to 1

user2  -- separate  copy  of x initialised with 0 incremented to 1
user2  -- same shared copy of count  incremented to 2

user3  -- separate  copy  of x initialised with 0 incremented to 1
user3  -- same shared copy of count  incremented to 3

user4  -- separate  copy  of x initialised with 0 incremented to 1
user4  -- same shared copy of count  incremented to 4







 */