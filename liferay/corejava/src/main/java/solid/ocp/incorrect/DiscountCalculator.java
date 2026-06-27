package solid.ocp.incorrect;

public class DiscountCalculator {
    float calculateDiscount(String customerType, float amount){

        switch (customerType){
            case "regular":
                return  amount*0.02f;
            case "premium":
                return  amount*0.04f;
            default:
                System.out.println("not matching");
                return  0;
        }
    }
}

class Main{

    public static void main(String[] args) {
        DiscountCalculator discountCalculator=new DiscountCalculator();

        var discount=discountCalculator.calculateDiscount("regular", 2000);
        System.out.println("Regular customer have discount "+discount);

        discount=discountCalculator.calculateDiscount("premium", 2000);
        System.out.println("Premium customer have discount "+discount);

    }

}