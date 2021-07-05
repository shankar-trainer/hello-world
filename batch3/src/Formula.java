
public final class Formula {
  final float PI=3.14f;
  final	double circleArea(float radius) {
		return  PI*radius*radius;
	}
	double circleCircumferencre(float radius) {
		return 2*PI*radius;
	}	
}
/*
class MyFormula extends Formula{
	@Override
	double circleArea(float radius) {
		return Math.PI*radius*radius*2;
		}
}*/

class FormualMain{
	public static void main(String[] args) {
	Formula formula=new Formula();
	System.out.println(formula.circleArea(5.6f));
	System.out.println(formula.circleCircumferencre(5.6f));
	 //formula.PI=3.444f;
	 
	}
}