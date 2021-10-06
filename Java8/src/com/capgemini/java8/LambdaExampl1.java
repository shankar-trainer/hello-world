package com.capgemini.java8;

@FunctionalInterface
interface hello {
	void welcome();
}
public class LambdaExampl1 {

	public static void main(String[] args) {
		hello hello1 = new hello() {
			@Override
			public void welcome() {
				System.out.println("welcome to java8");
			}
		};
		hello1.welcome();
      
		hello hello2 =()->{
			System.out.println("welcome  to java8 lambda ");
		};
		hello2.welcome();
	}
}

class outer{
	int x;
	String name;

	class inner{
		String nm;
		
	}
}
