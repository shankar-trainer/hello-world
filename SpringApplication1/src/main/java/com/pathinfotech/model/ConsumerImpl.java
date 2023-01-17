package com.pathinfotech.model;

public class ConsumerImpl   implements Consumer{
	private int consumerId;
	private String consumerName;
	private float consumersalary;

	public int getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public float getConsumersalary() {
		return consumersalary;
	}

	public void setConsumersalary(float consumersalary) {
		this.consumersalary = consumersalary;
	}

	@Override
	public void showConsumer() {
       System.out.println("Consumer Information");
       System.out.println("\tId is "+getConsumerId());
       System.out.println("\tName is "+getConsumerName());
       System.out.println("\tSalary is "+getConsumersalary());
	}

}
