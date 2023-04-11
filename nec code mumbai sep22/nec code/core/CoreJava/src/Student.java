
public class Student {

	private int roll;
	private String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
		Student st1=(Student) obj;
		if(st1.roll==this.roll && st1.name==this.name)
		 return true;
		}
		
		return false;
	}
	
	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student Record\n\troll is "
				+roll+"\n\tname is "+name;
	}
	*/
	
	
	
	
}
