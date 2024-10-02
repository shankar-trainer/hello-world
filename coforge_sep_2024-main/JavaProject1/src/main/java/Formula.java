public final  class Formula {

   //final  float pi=3.14f;
   final  float pi;
   float radius;

    public Formula() {
        this.pi=3.14f;
    }
    final float circleArea(float radius){
        return  pi*radius*radius;
    }
}
class MyFormula
//extends Math
{
    //extends  Formula{
//    @Override
//    float circleArea(float radius) {
//        return super.circleArea(radius)/2;
//    }
  java.lang.Math m;
}


/*
  Final
     final  variable as constant
      final method -- it cannot be overridden
      final class -- int cannot be sub classed

 */