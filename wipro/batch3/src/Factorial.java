public class Factorial {
    static long getFactorial(int x){
        int c=1;
        int fact=1;
        while(c<=x){
            fact=fact*c++;
        }
        return  fact;
    }
    static long getFactorialRecursion(int x) {
     if (x==0 || x==1 )
                return 1;
     else
         return x*getFactorialRecursion(x-1);
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int z=sc.nextInt();
        System.out.println("factorial of "+z+" is "+getFactorial(z));
        System.out.println("factorial of 0 is "+getFactorial(0));
        System.out.println("factorial of 1 is "+getFactorial(1));
        System.out.println("using recursion");
        System.out.println("factorial of 0 is "+getFactorialRecursion(0));
        System.out.println("factorial of 1 is "+getFactorialRecursion(1));
        System.out.println("factorial of "+z+" is "+getFactorialRecursion(z));
    }
}
