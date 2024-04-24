public class InterestCalculation {
    static float getInterest() {
        float amt;
        float rate;
        int time;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            System.out.println("Enter amount >0");
            amt = sc.nextFloat();
        }
        while (amt <= 0);
        do {
            System.out.println("Enter rate >0");
            rate = sc.nextFloat();
        }
        while (rate <= 0);
        do {
            System.out.println("Enter time >0");
            time = sc.nextInt();
        }
        while (time <= 0);
        return        amt * rate * time / 100;
    }

    public static void main(String[] args) {
     float interest=getInterest();
        System.out.println("Interest is :"+interest);
    }
}
