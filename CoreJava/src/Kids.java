public class Kids {

	private int id;
	private String name;
	private int age;

	private Father father;
	private Mother mother;

	public Kids(int id, String name, int age, Father father, Mother mother) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.father = father;
		this.mother = mother;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Father getFather() {
		return father;
	}

	public Mother getMother() {
		return mother;
	}

	public static void main(String[] args) {
		Father father = new Father(1001, "a kumar", 34);
		Mother mother = new Mother(1002, "suman sharma", 28);
		Kids kids = new Kids(98001, "rahul kumar", 5, father, mother);

		System.out.println("Kids Information");
		System.out.println("\tId " + kids.getId());
		System.out.println("\tName " + kids.getName());
		System.out.println("\tAge " + kids.getAge());

		System.out.println("\n Father Information");

		Father father1 = kids.getFather();
		System.out.println("\t Father Id " + father1.getFatherId());
		System.out.println("\t Father Name " + father1.getFatherName());
		System.out.println("\t Father Age " + father1.getFatherAge());

		System.out.println("\n Mother Information");
		
		Mother mother1 = kids.getMother();
		System.out.println("\t Mother Id " + mother1.getMotherId());
		System.out.println("\t Mother Name " + mother1.getMotherName());
		System.out.println("\t Mother Age " + mother1.getMotherAge());

	}

}
