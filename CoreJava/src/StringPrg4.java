
public class StringPrg4 {

	public static void main(String[] args) {

		String var = "ram goes to school";

		String ar[] = var.split(" ");

		for (String string : ar) {
			System.out.print(string + " , ");
		}

		System.out.println();
		var = "learning-java@is-easy@enjoy-java";

		ar = var.split("-|@");

		for (String string : ar) {
			System.out.print(string + " , ");
		}
		String a=null;
		
		  a=String.join(" and ",ar[0],ar[1],ar[2],ar[3],ar[4]);
		
		System.out.println("\na is "+a);

	}

}