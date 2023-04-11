package com.audintel.collection;

interface Addition{
	int sum(int a, int b);
}

public class LambdaExample1 {
	
	public static void main(String[] args) {
		
		Addition addition1=(a,b)->a+b;
		Addition addition2=(a,b)->{return a+b;};
		
		System.out.println(addition1.sum(11, 22));
		System.out.println(addition2.sum(111, 222));
	}
}
