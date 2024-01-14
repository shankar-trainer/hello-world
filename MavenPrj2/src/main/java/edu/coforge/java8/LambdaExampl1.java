package edu.coforge.java8;

@FunctionalInterface
interface  Welcome{
	void hello();
}
@FunctionalInterface
interface Calculator{
	float add(float a, float b);
}
public class LambdaExampl1 {

	public static void main(String[] args) {
		Welcome welcome2=()->{
			System.out.println("hello world...");
		};
		welcome2.hello();
		
		Calculator calculator=(x,y)->{return x+y;};
		Calculator calculator1=(x,y)->x+y;
		System.out.println(calculator.add(2.3f, 4.5f));
		System.out.println(calculator1.add(2.5f, 4.7f));
		
	}
}
