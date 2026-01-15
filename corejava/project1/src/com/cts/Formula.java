package com.cts;

public final class Formula { ;
    final float speed(float d1,float t1){
        return  d1/t1;
    }
}
  // final variable, method and class
// final methods cannot be overridden
// final class is not extended , all methods of final class are by default final
/*
class MyFormula extends  Formula{
    @Override
    float speed(float d1, float t1) {
        return 22.0f;
    }
}*/
// java.lang.Math is final class, cannot be inherited
/*
class TestMath extends  Math{

}
class TestAbc{
    public static void main(String[] args) {
        final int a=90;
        a=99;
        Math m=new Math();// Math class has private constructor
    }
}*/
