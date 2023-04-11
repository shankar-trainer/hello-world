
public class HumanMain {

	public static void main(String[] args) {
		
		Human human=new Patient();
		human.say();
		
		human=new Father();
		human.say();
		
		
		human=new Doctor();
		human.say();
		
	}
}
