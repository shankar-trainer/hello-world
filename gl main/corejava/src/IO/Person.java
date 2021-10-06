package IO;

import java.io.Serializable;

public class Person implements Serializable{
	private transient int pid;
	private String pname;
	private String address;
	static  String country="India";
	
	public Person(int pid, String pname, String address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public String getAddress() {
		return address;
	}
	
}
