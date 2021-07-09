package corejava;

public class SweetMain {

	public static void main(String[] args) {
		Sweet sweet1=new Sweet(878787, "Laddu", 200);
		Sweet sweet2=new Sweet(878787, "Laddu", 200);
		System.out.println(sweet1);
		
		System.out.println(sweet1.equals(sweet2));
	}
}
