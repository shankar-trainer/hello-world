public class Test2 {
    public static void main(String[] args) {
        int x=10;
        x=x+1;
        System.out.println(x);
        x=x+2;
        System.out.println(x);
        //x=x+1 -- same x+=1
        //x=x+2 -- same x+=2
        x+=2;
        System.out.println(x);
    }
}
