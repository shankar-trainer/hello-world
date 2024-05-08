public class PrePost {
    public static void main(String[] args) {
        int x=10;
        //x=x+1;
        //x++; //post increment , incremented and later assigned
        System.out.println(x);//10
        System.out.println(x++);//10
        System.out.println(x);//11
        System.out.println("post increment");
        //pre increment , pre decrement// incremented and assigned
        System.out.println(++x);//12
        System.out.println(x);//12
    }
}

