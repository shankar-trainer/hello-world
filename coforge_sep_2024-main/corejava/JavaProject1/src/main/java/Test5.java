public class Test5 {
    static int count=0;// class variable
    int c=0; // instance variable
    public Test5() {
         count++;
         c++;
    }

    public static void main(String[] args) {
        Test5 test1=new Test5();
        Test5 test2=new Test5();
        Test5 test3=new Test5();
        Test5 test4=new Test5();

        System.out.println(test4.count);
        System.out.println(test3.count);
        System.out.println(test2.count);
        System.out.println(test1.count);
        System.out.println("------------ \n");

        System.out.println(test4.c);
        System.out.println(test3.c);
    }
}
