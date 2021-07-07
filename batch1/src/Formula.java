
public final  class Formula {

 final	void speed(float d1,float d2) {
		System.out.println("speed is "+(d1+d2)/2);
   }
	final float pi=3.14f; 
}

/*class UserFormula extends Formula
{
	@Override
	void speed(float d1, float d2) {
		System.out.println("speed is "+(d1+d2)/3);
	}
}*/

class FormulaMain{
	public static void main(String[] args) {
		//formula.pi=5.14f;
	  Formula formula2=new Formula();
	  formula2.speed(123, 23);
	  System.out.println("pi is "+formula2.pi);
	}
}