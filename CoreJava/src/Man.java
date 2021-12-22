
public class Man {

	void behaviour() {
		System.out.println(" I am a man");
	}
}
class Officer extends Man{
	  @Override
	void behaviour() {
	System.out.println("I am an office");
	  }
}

class Guardian extends Man{
	@Override
	void behaviour() {
		System.out.println("I am a guardian");
	}
}

class Patient extends Man{
	@Override
	void behaviour() {
		System.out.println("I am a patient");
	}
}



