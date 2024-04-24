public class InverseOfNo {

    static int inverse(int d) {
        int s = 0;

        while (d != 0) {
            s = s*10 + d % 10;
            d = d / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("inverse of 123 is "+inverse(123));
    }
}
/*

take an number from user and display inverse of the number .
make static int inverse(int p) method


 */
