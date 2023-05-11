package edu.chitkara.exception;

public class Manager {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) throws ManagerException {
		if (id <= 0)
		throw new ManagerException("id cannot be zero or -ve");
		else if (id < 1000 || id > 10000)
throw new ManagerException("id must be between 1000 - 10000");
		this.id = id;
	}
	public void setName(String name) throws ManagerException {
		if (name.isEmpty())
			throw new ManagerException("name is empty");
		else if (name.length() < 5)
			throw new ManagerException("name must of more than 5 character ");

		this.name = name;
	}

	public String getName() {
		return name;
	}


}
