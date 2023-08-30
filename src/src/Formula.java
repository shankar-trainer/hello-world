  // final class cannot be sub classed
public final  class Formula {

	float speed(float s1, float s2) {
		return (s1+s2)/2;
	}
	
	float acceleration(float s1, float s2, float time) {
		return (s2-s1)/time;
	}
}


//
//class MyFormula  extends Formula{
//	@Override
//	float acceleration(float s1, float s2, float time) {
//		// TODO Auto-generated method stub
//		return super.acceleration(s1, s2, time);
//	}
//	
//	@Override
//	float speed(float s1, float s2) {
//		// TODO Auto-generated method stub
//		return super.speed(s1, s2);
//	}
//}
