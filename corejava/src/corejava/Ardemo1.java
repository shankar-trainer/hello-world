package corejava;

public class Ardemo1 {

	public static void main(String[] args) {

		int ar[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for (int i : ar) {
			sum=sum+i;
			System.out.print(i+" , ");
		}
		System.out.println("sum is "+sum);
	}
}
