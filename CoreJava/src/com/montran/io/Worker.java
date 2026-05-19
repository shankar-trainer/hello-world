package com.montran.io;

import java.io.Serializable;

public class Worker  implements Serializable{

	 private  transient int workerId;
	 private String  workerName;
	 private float  workerwages;
	 private static String country="India";

	 public Worker(int workerId, String workerName, float workerwages) {
		super();
		this.workerId = workerId;
		this.workerName = workerName;
		this.workerwages = workerwages;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public void setWorkerwages(float workerwages) {
		this.workerwages = workerwages;
	}

	public static void setCountry(String country) {
		Worker.country = country;
	}

	@Override
	public String toString() {
		return "Worker [workerId=" + workerId + ", workerName=" + workerName + ", workerwages=" + workerwages + "  Country ="+ country +"]";
	}
	 
	 
	 
}
