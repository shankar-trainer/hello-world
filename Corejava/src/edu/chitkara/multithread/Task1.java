package edu.chitkara.multithread;

public class Task1  extends Thread{
   @Override
public void run() {
    for (int i = 1; i <20; i++) {
		System.out.println(i+"  name " +getName()+" priority "+getPriority());
	}
   }
}
class Task2  extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <20; i++) {
			System.out.println(i+"  name " +getName()+" priority "+getPriority());
		}
	}
}
class Task3  extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <20; i++) {
			System.out.println(i+"  name " +getName()+" priority "+getPriority());
		}
	}
}
class Task4  extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <20; i++) {
			System.out.println(i+"  name " +getName()+" priority "+getPriority());
		}
	}
}
