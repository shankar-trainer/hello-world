package solid.ocp.correct;

class DiscountCalculator {

    public float discountCalc(Discount discount, float amt) {
        return discount.calculate(amt);
    }

}