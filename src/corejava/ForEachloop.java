package corejava;

public class ForEachloop {
	
	public static void main(String[] args) {
		
		int ar[]= {11,22,33,44,55};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+",");
		}
		
		System.out.println();
		System.out.println("using for each loop ");
		
		for (int i : ar) {
			System.out.print(i+",");
		}
	}

}
