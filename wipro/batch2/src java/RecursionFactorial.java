public class RecursionFactorial {

    static long factorial(int n){
        if(n==0)
            return  1;
        return  n*factorial(n-1);
    }
    public static void main(String[] args) {

        for (int i = 0; i <=8 ; i++) {
            System.out.println("factorial of "+i+" is "+factorial(i));
        }
    }

}
