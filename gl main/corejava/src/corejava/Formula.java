package corejava;

public  class Formula {
  
	 final float PI=3.14f;
  
	final float speed(float s1, float s2){
		return (s1+s2)/2;
	}
	
	void formula1(){
		final int y=10;
	}
	
}

class MyFormula extends Formula{
	
	@Override
	float speed(float s1, float s2) {
		return speed(s1, s2)/3;
	}
	
	@Override
	void formula1() {
		// TODO Auto-generated method stub
		super.formula1();
		PI=3.15f;
		
	}
	
}
