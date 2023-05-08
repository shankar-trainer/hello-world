package edu.chitkara;

public  final   class  Formula {
	 
    final float speed(float distance1,float distance2) {
    	return (distance1+distance2)/2;
    }
    final float accelaration(float speed1,float speed2,float time) {
    	return (speed2-speed1)/time;
    }
    
    void Info() {
    	System.out.println("information  ...");
    }
    
}
/*
class MyFormula extends Formula{
	@Override
	float speed(float distance1, float distance2) {
		return  (distance1+distance2)/3;
	}
	 @Override
	void Info() {
		super.Info();
	}
}
*/