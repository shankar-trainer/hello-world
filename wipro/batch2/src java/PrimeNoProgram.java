public class PrimeNoProgram {
    /*
    display prime no between  1 to 100
     */
    static boolean checkPrime(int p) {
        int c = 2;
        while (c <= p - 1) {
            if (p % c == 0)
                return false;
            c++;
        }
        return true;
    }
    static void prime(){
        int p=1;
        while(p<=100){
            if(checkPrime(p))
                System.out.print(p+",");
            p++;
        }
    }

    public static void main(String[] args) {
        prime();
    }
}
