package solid.ocp.correct;

class PremiumDiscount extends  Discount{
    @Override
    public float calculate(float amt) {
        return amt*0.04f;
    }
}