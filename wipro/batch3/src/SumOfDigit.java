public class SumOfDigit {
static int sum(int k){
    int s=0;
    while(k!=0){
        s=s+k%10;
        k=k/10;
    }
    return  s;
}

    public static void main(String[] args) {
        System.out.println("sum of digits of 1234 : "+sum(1234));
        System.out.println("sum of digits of 123 : "+sum(123));
        System.out.println("sum of digits of 8910 : "+sum(8910));
    }
}

