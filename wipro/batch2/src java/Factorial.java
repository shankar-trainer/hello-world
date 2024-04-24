public class Factorial {

    static void getFactorial(int p) {
        //1*2*3*4*5
        int c = 1;
        int fact = 1;
        do {
            fact = fact * c++;
        }
        while (c <= p);
        System.out.println("\nfactorial of " + p + " is " + fact);
    }

    static int getFactorial1(int p) {
        //5*4*3*2*1
        if(p==0)
            return  1;
        int c = p;
        int fact = 1;
        do {
            fact = fact * c--;
        }
        while (c >= 1);
        return fact;
    }


    public static void main(String[] args) {
        int k;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        k = sc.nextInt();
        getFactorial(k);
        getFactorial(4);
        k = sc.nextInt();
        System.out.println("\nfactorial of " + k + " is " + getFactorial1(k));
    }

}
