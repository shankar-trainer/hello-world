package edu.chitkara.exception;

public class ManagereMain {

	public static void main(String[] args) {

		Manager manager = new Manager();
		try {
			//manager.setId(0);
			//manager.setId(800);
			manager.setId(8000);
			//manager.setName("");
	//		manager.setName("ravi");
			manager.setName("ravi kumar");

			System.out.println("manager  information");
			System.out.println("\tid is " + manager.getId());
			System.out.println("\tname is " + manager.getName());
		} catch (ManagerException e) {
			System.err.println(e.getMessage());
		}
	}
}
