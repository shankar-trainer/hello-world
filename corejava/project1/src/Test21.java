public class Test21 {

    static long factorial(long l) {
        long fact = 1;
        int count = 1;
        while (count <= l) {
            fact = fact * count;
            count++;
        }
        return fact;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println("x is " + x);
        System.out.println("factorial program");
        long result = factorial(x);


        System.out.printf("\n\tfactorial  of %d  is %d ", x, result);
    }
}
