package pack3;

public class SavingAccount  extends Account{

	@Override
	public void accountOpen() {
		System.out.println("saving account open");
	}

	@Override
	public void accountClose() {
		System.out.println("saving account close");
	}

}
