public class InterestCalculation {
    static float interestCalc() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        float amt, rate;
        int time;
        do {
            System.out.println("enter amount >=0");
            amt = sc.nextFloat();
        }
        while (amt <= 0);
        do {
            System.out.println("enter rate >=0");
            rate = sc.nextFloat();
        }
        while (rate <= 0);
        do {
            System.out.println("enter time >=0");
            time = sc.nextInt();
        }
        while (time <= 0);
        return amt * rate * time / 100;
    }

    public static void main(String[] args) {
        System.out.println("interest is " + interestCalc());
    }
}
