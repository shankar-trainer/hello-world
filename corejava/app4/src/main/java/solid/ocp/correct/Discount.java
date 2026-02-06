package solid.ocp.correct;

public abstract  class Discount {
public abstract  double calculate(double amt);
}

class RegularDiscount extends  Discount{
    @Override
    public double calculate(double amt) {
        return amt*0.1;
    }
}

class PremiumDiscount extends  Discount{
    @Override
    public double calculate(double amt) {
        return amt*0.2;
    }
}