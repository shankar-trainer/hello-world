
public class Main_main {

	public static void main(String[] args) {
		Man man;
		
		man=new Patient();
		man.behaviour();
		
		man=new Guardian();
		man.behaviour();
		
		man=new Officer();
		man.behaviour();
	}
}
