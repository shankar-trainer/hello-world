package cn.com.wan.struts2.vo;

public class Student {
	private String username;  
    private int grade;  
    /* 两个属性的setter和getter略 */  
      
    //只要是重写一个类的构造方法，就必须要为这个类保留空的构造方法  
    //因为框架默认的都会去调用无参的空的构造方法  
    public Student(){};  
    public Student(String username,int grade){  
        this.username = username;  
        this.grade = grade;  
    }  
    @Override  
    public String toString() {  
        //如果不重写它的toString()方法的话，默认调用toString()将输出【类型+@+内存地址的哈希值】  
        return "{学生姓名：" + username + "，成绩：" + grade + "}";  
    }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}  
}
