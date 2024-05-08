
public class SumOf10No {
    static int sum(){
        int c=1;
        int sum=0;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        while(c<=10) {
            System.out.println("enter no");
           int s=sc.nextInt();
           sum=sum+s;
           c++;
        }
        return  sum;
    }

    public static void main(String[] args) {
        System.out.println("sum of 10 no is "+sum());
    }
}
