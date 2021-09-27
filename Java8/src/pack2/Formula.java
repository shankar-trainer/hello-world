package pack2;

public class Formula {

	final float speed(float d1, float d2) {
		return (d1+d2)/2;
	}
	
final	double cicleArea(float radius){
		return Math.PI*(radius*radius);
	}
}


class MyFormula extends Formula{
	/*
	 * @Override float speed(float d1, float d2) { return (d1+d2)/3; }
	 * 
	 * @Override double cicleArea(float radius){ return Math.PI*(radius*radius)/2; }
	 */	

}