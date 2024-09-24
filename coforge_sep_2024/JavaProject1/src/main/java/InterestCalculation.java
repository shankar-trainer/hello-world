public class InterestCalculation {
    static float intCalc() {
        float amt, rate;
        int time;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            System.out.println("Enter rate >0 ");
            rate = sc.nextFloat();
        } while (rate <= 0);

        do {
            System.out.println("Enter amount >0 ");
            amt = sc.nextFloat();
        } while (amt <= 0);
        do {
            System.out.println("Enter time >0 ");
            time = sc.nextInt();
        } while (time <= 0);

        return amt * rate * time / 100;

    }

    public static void main(String[] args) {
        System.out.println("Interest is " + intCalc());
    }

}
