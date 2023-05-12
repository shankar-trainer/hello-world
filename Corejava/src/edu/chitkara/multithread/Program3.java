package edu.chitkara.multithread;

public class Program3 extends Thread {
	int x = 1;

	public Program3(String s) {
		setName(s);
		start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(x++ + "  " + getName());
			try {
				if (getName().equals("process1"))
					Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Program3("process1");
		new Program3("process2");
		new Program3("process3");
	}

}
