// MyPhone has 3 super class UserPhone Mobile MyBasicMobile
public class MyPhone extends UserPhone implements Mobile, MyBasicMobile {

	public MyPhone(int id, float cost, String model) {
		super(id, cost, model);
	}

	@Override
	public void call() {
		System.out.println("Using MyPhone we can call");
	}

	@Override
	public void playMusic() {
		System.out.println("Using MyPhone we can play music");
	}

	@Override
	public void message() {
		System.out.println("Using MyPhone we can send message");
	}

	public static void main(String[] args) {
		MyPhone myPhone = new MyPhone(5656656, 5600, "Nokia");
		System.out.println("My phone details ");
		System.out.println("\tId " + myPhone.id);
		System.out.println("\tModel  " + myPhone.model);
		System.out.println("\tCost " + myPhone.cost);
		System.out.println("\tCountry " + country);

		System.out.println("\n My Phone functions \n");

		myPhone.call();
		myPhone.playMusic();
		myPhone.message();
	}
}
