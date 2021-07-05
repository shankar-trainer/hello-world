package corejava;

public final class Formula {
   final String country="india";   
	float interestCalculation(float amt, float rate, int time) {
	   return (amt*rate*time)/100;
   }
	
	final void speed(float d1,float d2) {
		System.out.println(" speed is "+(d1+d2)/2);
	} 
}
class FormulaMain{
	public static void main(String[] args) {
		Formula formula=new Formula();
		formula.speed(100, 200);
		//formula.country="";
		
		System.out.println("country is "+formula.country);
	}
}

/*
 * class UserFormula extends Formula{
 * 
 * @Override void speed(float d1, float d2) {
 * System.out.println(" speed is "+(d1+d2)/3); }
 * 
 * @Override float interestCalculation(float amt, float rate, int time) { return
 * super.interestCalculation(amt, rate, time); }
 * 
 * }
 */