
public final class  Formula {

 final 	float acceleration(float s1, float s2) {
		return (s1 + s2) / 2;
	}
  
  void interestCalculation() {
	  //formula
  }
}

class Myformula extends Formula {

	@Override
	float acceleration(float s1, float s2) {
		return (s1 + s2) / 12;
	}
	
	@Override
	void interestCalculation() {
		//changed formula
	}

}