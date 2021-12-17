
public class StringSplit {

	public static void main(String[] args) {
		String var = "we are learning java";

		String ar[] = var.split(" ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		String a="";
		for (int i = ar.length-1; i>=0; i--) {
			a=a+(ar[i]+" ");
		}
		System.out.println();
		System.out.println(a);
	}
}
