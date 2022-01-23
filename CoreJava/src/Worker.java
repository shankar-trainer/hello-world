
public class Worker {

	private int id;
	private String name;
	private  float wages ;
	private Address addr;  // has a relationship , worker has an address

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWages() {
		return wages;
	}
	public void setWages(float wages) {
		this.wages = wages;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	
	
}
