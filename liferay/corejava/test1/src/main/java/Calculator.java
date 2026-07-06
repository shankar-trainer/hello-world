public class Calculator {

   protected float addition(float a, float b){
        return  a+b;
    }

}

class MyCalculator extends Calculator{
    @Override
   protected float addition(float a, float b) {
        return a+b;
    }
}

/*
private
default
protected
public
*/