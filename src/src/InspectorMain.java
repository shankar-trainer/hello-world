
public class InspectorMain {

	public static void main(String[] args) {
		Inspector inspector = new Inspector();

		System.out.println(" id  " + inspector.id);
		
		System.out.println("state " + Inspector.state);
		
		System.out.println("country  " + Inspector.country);

		inspector.inspectorInfo();
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.signum(Math.PI/2));
		
	}
}
