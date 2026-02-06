package solid.ocp.correct;

public class DiscountCalculator {
    public double calculateDiscount(Discount discount, double amt){
        return discount.calculate(amt);
    }

    public static void main(String[] args) {

        Discount regular=new RegularDiscount();
        Discount premium=new PremiumDiscount();

        DiscountCalculator discountCalculator=new DiscountCalculator();

        System.out.println("Regular "+
        discountCalculator.calculateDiscount(regular,2000));

        System.out.println("Premium "+
        discountCalculator.calculateDiscount(premium,2000));
    }
}
