package solid.ocp.correct;

public class DiscountMain {
    public static void main(String[] args) {
        DiscountCalculator calculator=new DiscountCalculator();

       Discount premiumDiscount=new PremiumDiscount();
       Discount regularDiscount=new RegularDiscount();
        System.out.println("premium discount "+calculator.discountCalc(premiumDiscount,4000)); System.out.println("regular discount "+calculator.discountCalc(regularDiscount,4000));
    }
}
