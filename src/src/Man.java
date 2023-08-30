public class Man {
  void behaviour() {
	  System.out.println("i am a man");
  }
}

 class Father  extends Man{
	 @Override
	void behaviour() {
		System.out.println("i am a father");
	}
}
 class LicEmployee  extends Man{
	 @Override
	 void behaviour() {
		 System.out.println("i am a  LIC Employee");
	 }
 }
