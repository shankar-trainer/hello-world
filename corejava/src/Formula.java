public final class Formula {

	float speed(float d1, float d2) {
		return (d1+d2)/2;
	}
	
	float acceleration(float d1, float d2) {
		return 0;
	}
}
// Final class can not be  sub classed

//class MyFormula extends Formula{
//	
//	@Override
//	float acceleration(float d1, float d2) {
//		// TODO Auto-generated method stub
//		return super.acceleration(d1, d2);
//	}
//	
//	@Override
//	float speed(float d1, float d2) {
//		// TODO Auto-generated method stub
//		return super.speed(d1, d2);
//	}
//	
//}

