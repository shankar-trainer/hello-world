public class Calculation {
    static float addition(float a, float b ){
        return  a+b;
    }
    static float subtraction(float a, float b ){
        return  a-b;
    }

    public static void main(String[] args) {
        double d1=545456.5665;
        float  n1=56.5F;
        float  n2=5.45f;
        //float a=89.56f;
        System.out.println("no1 is "+n1);
        System.out.println("no2 is "+n1);
        System.out.println("addition  is "+addition(n1,n2));
        System.out.println("subtraction  is "+subtraction(n1,n2));
    }
}
