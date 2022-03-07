
public class WorkerMain {

	public static void main(String[] args) {
		
		Worker worker1=new Worker();
		Worker worker2=new Worker(202,"manibhushan kanth",34000,"madurai");
		Worker worker3=new Worker(203,"mohammad ehsan",67000,"kolkotta");
		
	System.out.println("\nworker 1");
	System.out.println("worker id "+worker1.getWorkerId());
	System.out.println("worker name "+worker1.getWorkerName());
	System.out.println("worker location "+worker1.getWorkerLocation());
	System.out.println("worker wages  "+worker1.getWorkerWages());
	
	System.out.println("\nworker 2");
	System.out.println("worker id "+worker2.getWorkerId());
	System.out.println("worker name "+worker2.getWorkerName());
	System.out.println("worker location "+worker2.getWorkerLocation());
	System.out.println("worker wages  "+worker2.getWorkerWages());
	
	System.out.println("\nworker 3");
	System.out.println("worker id "+worker3.getWorkerId());
	System.out.println("worker name "+worker3.getWorkerName());
	System.out.println("worker location "+worker3.getWorkerLocation());
	System.out.println("worker wages  "+worker3.getWorkerWages());
	
	
	
	}
}
