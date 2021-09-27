package pack3;

public class CurrentAccount  extends Account{

	@Override
	public void accountOpen() {
		System.out.println("current account open");
	}

	@Override
	public void accountClose() {
		System.out.println("current account close");
	}

}
