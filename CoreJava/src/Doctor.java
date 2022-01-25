
public abstract class Doctor {

	private int regNo;
	private String name;
	private int age;

	public int getRegNo() {
		return regNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Doctor(int regNo, String name, int age) {
		this.regNo = regNo;
		this.name = name;
		this.age = age;
	}

	public abstract void doctorInfo();// abstract method

}

class MedicineDoctor extends Doctor {  
	private String location;

	public MedicineDoctor(int regNo, String name, int age, String location) {
		super(regNo, name, age);
		this.location = location;
	}

	@Override
	public void doctorInfo() {// concrete method 
		System.out.println("doctor information ");
		System.out.println("reg no " + getRegNo());
		System.out.println("reg no " + getName());
		System.out.println("reg no " + location);
	}

}

class doctorMain {

	public static void main(String[] args) {
		MedicineDoctor doctor = new MedicineDoctor(65566556, "kavya chaturvedi", 45, "delhi");
		doctor.doctorInfo();

	}
}