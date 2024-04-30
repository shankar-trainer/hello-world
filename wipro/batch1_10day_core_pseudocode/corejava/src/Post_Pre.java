public class Post_Pre {
    public static void main(String[] args) {
        int x=10;
        //post incremented
        System.out.println(x);
        System.out.println(x++);// incremented but not assigned
        System.out.println(x);

        //pre increment
        int z=50;
        System.out.println(z);
        System.out.println(++z);// incremented and assigned
        System.out.println(z);

    }
}
