public final class Formula {
    final float pi = 3.14f;

    final float circleArea(float radius) {
        return pi * radius * radius;
    }

    void formulaInfo() {
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        Formula formula = new Formula();
        //  formula.pi=77676.56f;
        System.out.println("area is " + formula.circleArea(3.45f));
    }
}


