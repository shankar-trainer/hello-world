package cn.com.wan.struts2.vo;

public class User {
	private String username;  
    private String password;  
    private Address address;  
    /* 三个属性的setter和getter略 */  
    public String getVOMethod(){  
        return "这是User类中的一个普通方法";  
    }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}  
}
