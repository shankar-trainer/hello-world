package com.montran.error;

interface Phone {
	float cost = 6789;

	void call();
	void message();
}

abstract class Manager {
	private int managerId;
	private String managerName;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	abstract void managerInfo();

}

public class AnonymousClass {

	Manager manager = new Manager() {
		@Override
		void managerInfo() {
			System.out.println("manager id  is " + getManagerId());
			System.out.println("manager name  is " + getManagerName());
		}
	};

	public static void main(String[] args) {
		AnonymousClass anonymousClass = new AnonymousClass();
		anonymousClass.manager.setManagerId(100001);
		anonymousClass.manager.setManagerName("ram prasad ");

		anonymousClass.manager.managerInfo();

		Phone phone = new Phone() {

			@Override
			public void message() {
				System.out.println("using phone we can send and receive message");
			}

			
			
			@Override
			public void call() {
				System.out.println("using phone we can call other and receive call ");
			}
		};

		phone.call();
		phone.message();
		System.out.println("Phone cost " + Phone.cost);

	}
}
