public class InterestCalculation {
    static float getInterest(float a,float r,int t){
        return a*r*t/100;
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        float amount,rate;
        int time;
        do {
            System.out.println("Enter amount ");
            amount = sc.nextFloat();
        }
        while(amount<=0);
        do {
            System.out.println("Enter rate");
            rate = sc.nextFloat();
        }
        while(rate<=0);
        do {
            System.out.println("Enter time");
            time = sc.nextInt();
        }
        while (time<=0);
        float interest=getInterest(amount,rate,time);

        System.out.printf("Interest for amount %f, rate %f and time %d is %f",amount,rate,time,interest);
        System.out.printf("\nInterest for amount %.2f, rate %.2f and time %d is %.2f",amount,rate,time,getInterest(amount,rate,time));
        System.out.println("\nInterest for amount,"+amount+" rate "+rate+"  time "+time+" is "+getInterest(amount,rate,time));
    }
}
