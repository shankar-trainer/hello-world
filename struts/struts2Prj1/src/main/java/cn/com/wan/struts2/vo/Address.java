package cn.com.wan.struts2.vo;

public class Address {
	//如果将TIPS设为private的话，loginSuc.jsp中就无法获取它的属性值了  
    //事实上将一个静态的final属性设为private是毫无意义的  
    //因为既然设置成了静态，那么就是供他人调用的，如果再设成private的话，别的地方根本就无法调用了  
    //即使OGNL再怎么强大，它也不可能违反Java的规则，所以不要将静态的属性设为私有  
    public static final String TIPS = "玄玉加油!!";  
    //addr属性的setter和getter略  
    private String addr;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}  
}
