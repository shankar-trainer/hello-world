package solid.ocp.incorrect;

public class DiscountCalculator {
    public double calculateDiscount(String custType,double amt){
        if(custType.equals("regular")){
            return amt*0.1;
        }
        else  if(custType.equals("premium")){
            return amt*0.2;
        }
        return 0;
    }

    public static void main(String[] args) {
        DiscountCalculator discountCalculator=new DiscountCalculator();

        System.out.println("Regular customer discount is "+discountCalculator.calculateDiscount("regular",1200));
        System.out.println("Premium customer discount is "+discountCalculator.calculateDiscount("premium",1200));


    }
}
