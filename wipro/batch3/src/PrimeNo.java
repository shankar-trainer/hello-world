public class PrimeNo {
    static boolean checkPrime(int p) {
        int c = 2;

        while (c <= p - 1) {
            if (p % c == 0)
                return false;
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("1 is prime "+checkPrime(1));
        System.out.println("2 is prime "+checkPrime(2));
        System.out.println("3 is prime " + checkPrime(3));
        System.out.println("4 is prime " + checkPrime(4));
        System.out.println("5 is prime " + checkPrime(5));
        System.out.println("7 is prime " + checkPrime(7));
        System.out.println("11 is prime " + checkPrime(11));
    }
}
