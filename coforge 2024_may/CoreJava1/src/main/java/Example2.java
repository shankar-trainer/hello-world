public class Example2 {

	static float circumference(float radius) {
		return 2*3.14f*radius;
	}
	
	static float area(float radius) {
		return 3.14f*radius*radius;
	}
	
	public static void main(String[] args) {
		//int x=887.56566;
		double d1=656565.55676; // all decimal are double 
		float  f1=766776.6556F;
		float radius=56.45f;
		
		float cir=circumference(radius);
		float ar=area(radius);
		System.out.println("area of radius "+radius +"  is "+ar);	
		System.out.printf("\narea of radius %f   is %f",radius,ar);	
		System.out.printf("\narea of radius %.2f   is %.2f",radius,ar);	
		System.out.printf("\ncircumference of radius %.2f   is %.2f",radius,cir);	
	}
}
