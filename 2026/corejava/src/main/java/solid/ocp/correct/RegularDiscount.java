package solid.ocp.correct;

class RegularDiscount extends  Discount{
    @Override
    public float calculate(float amt) {
        return amt*0.02f;
    }
}
