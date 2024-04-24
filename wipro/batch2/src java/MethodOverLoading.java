public class MethodOverLoading {

    int addition(int x, int y) {
        return x + y;
    }

    float addition(float x, float y) {
        return x + y;
    }

    String addition(String x, String y) {
        return x + y;
    }

    String addition(String x, String y, String z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        System.out.println(methodOverLoading.addition(55.4f, 67.6f));
        System.out.println(methodOverLoading.addition(11, 22));
        System.out.println(methodOverLoading.addition("mohan", "kumar"));
        System.out.println(methodOverLoading.addition("amit", "kumar", "sharma"));
    }
}
