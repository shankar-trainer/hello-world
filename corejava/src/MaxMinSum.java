public class MaxMinSum {

	public static void main(String[] args) {

		int sum = 0;
		int max = 0;
		int min = 0;
		int x = 0;
		int count = 1;

		while (count <= 10) {
			System.out.println(count + " : Enter no ");

			x = new java.util.Scanner(System.in).nextInt();
            if(count==1)
            	max=min=x;
            
			if (x >= max)
				max = x;
			else if (x <= min)
				min = x;
			sum = sum + x;
			count++;
		}
		display(sum, max, min);
	}

	static void display(int total, int highest, int lowest) {
		System.out.println("Result : ");
		System.out.println("\tHighest : " + highest);
		System.out.println("\tLowest : " + lowest);
		System.out.println("\tTotal : " + total);
	}
}
