public class Recursion_Power_Exponentiation {
    static float power(float base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        float b=3.0f;
        int e=2;
        System.out.println(b+" exponent "+e+" is "+power(b,e));
        b=4;
        e=3;
        System.out.println(b+" exponent "+e+" is "+power(b,e));

    }
}
/*
 b=3,e=2
  base*power(base,exponent-1)
  3*power(3,1)
  3*3=9

b=4,e=3
 4*power(4,2)

 */