package edu.chitkara.multithread;

public class TaskMain {
 public static void main(String[] args) {
	
	// Thread t1=new Task1();
	 Task1 t1=new Task1();
	 Task2 t2=new Task2();
	 Task3 t3=new Task3();
	 Task4 t4=new Task4();
	
	 t1.setName("job1");
	 t2.setName("job2");
	 t3.setName("job3");
	 t4.setName("job4");
	 
	 t1.setPriority(1);
	 t3.setPriority(Thread.MIN_PRIORITY); //Thread.MIN_PRIORITY = 1
	 t2.setPriority(10);             
	 t4.setPriority(Thread.MAX_PRIORITY);
	 
	 t1.start();
	 t2.start();
	 t3.start();
	 t4.start();
}
}
