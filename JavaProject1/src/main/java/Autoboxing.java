public class Autoboxing {

    public static void main(String[] args) {

        Integer x=new Integer(10001);  // boxing

        int p=x.intValue();// unboxing
        p++;
        x=new Integer(p);


        Integer k=9;
        k++;       // autoboxing


         String age="54";

         // static method
         int age1=Integer.parseInt(age);

        Integer p1= Integer.valueOf(age);

        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        int d2=-2147483648;
       // int d3=-2147483649;
        int p3=2147483647;
        //int p4=2147483648;

        long l1=2147483648L;



    }

}
