public class Worker {

	private int workerId;
	private  String workerName;
	private float workerWages;
	private String workerLocation;
	
	public Worker() {
	  System.out.println("default constructor ");
	  this.workerId=998980;
	  this.workerWages=1000;
	  this.workerName="arvind";
	  this.workerLocation="chennai";
	}

	public Worker(int workerId, String workerName, float workerWages, String workerLocation) {
		this.workerId = workerId;
		this.workerName = workerName;
		this.workerWages = workerWages;
		this.workerLocation = workerLocation;
		System.out.println("overloaded  constructor called ");
	}

	public int getWorkerId() {
		return workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public float getWorkerWages() {
		return workerWages;
	}

	public String getWorkerLocation() {
		return workerLocation;
	}
	
	
	
}
