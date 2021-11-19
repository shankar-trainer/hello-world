
public class VarArgProgram {

	static void display(int a, int b, int... c) {
      System.out.println(a);
      System.out.println(b);
      
      int sum=0;
      for(int k:c) {
    	  sum=sum+k;
      }
      System.out.println("sum is "+sum);
	}

	public static void main(String[] args) {
		display(11, 12, 1);
		display(11, 12, 1, 2);
		display(11, 12, 1, 2, 3);

		int ar[] = { 11, 22, 33 };

		display(11, 12, ar);
	}
}
