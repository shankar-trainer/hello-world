
public class WrapperDemo3 {

	public static void main(String[] args) {

		String age = "33";
		String salary = "45344.34";

		int age1 = Integer.parseInt(age);
		float salary1 = Float.parseFloat(salary);
		System.out.println(age1 + 10);
		System.out.println(salary1 - (salary1 * 10 / 100.0f));
	}
}
