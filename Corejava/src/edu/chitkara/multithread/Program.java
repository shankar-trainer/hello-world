package edu.chitkara.multithread;

class Test {
	static int x = 1;
}
public class Program implements Runnable {
 //synchronized
 void   increment() {
		System.out.print(Test.x++ + ",");
	}
	@Override
	public void run() {
			increment();
			increment();
			increment();
	}
	public static void main(String[] args) {
	   Program program=new Program();
	   new Thread(program).start();
	   new Thread(program).start();
	   new Thread(program).start();
	}

}
