public class SumOfDigits {

    static int sum(int d) {
        int sum = 0;

        while (d != 0) {
            sum = sum + d % 10;
            d = d / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println( "sum of 1234 is "+sum(1234));
        System.out.println( "sum of 4001 is "+sum(4001));
    }
}
/*
1234
sum=0+1234%10=0+4=4
d=1234/10=123

sum=4+123%10=4+3=7
d=123/10=12

sum=7+12%10=7+2=9
d=12/10=1

sum=9+1%10=9+1=10
d=1/10=0
 */