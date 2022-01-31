package edu.lpu.lambda;

interface Hello {
	void add();
}

public class AnonymousInner {

	public static void main(String[] args) {
		Hello h = new Hello() {
			@Override
			public void add() {
				System.out.println("addition called");
			}
		};
		h.add();
	}
}
