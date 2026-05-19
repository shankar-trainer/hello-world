interface Father {
	float F_salary = 20000;
	String country = "india";
}

interface Mother {
	float M_salary = 60000;
	String language = "tamil";// public static and final
}

public interface Child extends Father, Mother {
  	public   void childInfo();
}
class Kids {
	int age;
	String name;

	public Kids(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("kids constructor ");
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}


class Mychild extends Kids implements Father, Mother {

	private String school;

	public Mychild(int age, String name, String school) {
		super(age, name);
		this.school = school;
		System.out.println("MyChild constructor ");
	}

	public static void main(String[] args) {
		Mychild mychild = new Mychild(5, "babu kumar", "kids play ");
		System.out.println(mychild.getName());
		System.out.println(mychild.getAge());
		System.out.println(mychild.school);
		System.out.println(Father.country);
		System.out.println(Father.F_salary);
		System.out.println(Mother.language);

		// Father.F_salary=8788787;
	}

}
