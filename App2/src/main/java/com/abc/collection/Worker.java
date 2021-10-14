package com.abc.collection;

public class Worker {

	private int workerId;
	private String workerName;

	public Worker(int workerId, String workerName) {
		super();
		this.workerId = workerId;
		this.workerName = workerName;
	}

	@Override
	public String toString() {
		return "Worker Information\n\tId is " + workerId + "\n\tName is " + workerName;
	}

	public static void main(String[] args) {
		Worker worker1 = new Worker(10001, "pawan kumar");
		Worker worker2 = new Worker(10002, "amit kumar");

		System.out.println(worker1);
		System.out.println(worker2);
	}

}
