public class SumOfDigits {

    static int sumOfDigit(int a){
        int s=0;
        while(a!=0){
            s=s+a%10;
            a=a/10;
        }
        return s;
    }

    public static void main(String[] args) {
        /*
        System.out.println(10/12);//
        System.out.println(10/10);//1
        System.out.println(10/9);//1
        System.out.println(10%11);//10
        System.out.println(10%10);//0
        System.out.println(10%9);//1
        System.out.println(10%8);//2
*/
        /*System.out.println(1234/10);//123
        System.out.println(1234%10);//4
        System.out.println(123/10);
        System.out.println(123%10);
*/
        int x=new java.util.Scanner(System.in).nextInt();
        System.out.println("sum is "+sumOfDigit(x));
    }
}
