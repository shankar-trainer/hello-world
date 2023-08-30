import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		
	   
		System.out.println("hello"=="hello"); // 2 references with same object in  string pool 
		System.out.println("hello"==new String("hello"));// 2 references with two different object 1 in string pool
		                                                  // 1 outside string pool
		System.out.println("hello".equals(new String("hello")));
		
		System.out.println("ram"== (new Scanner(System.in).next()));
		// string user input create object outside the string pool 
		System.out.println("ram".equals(new Scanner(System.in).next()));
		
		
	}
}
