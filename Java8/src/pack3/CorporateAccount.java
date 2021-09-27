package pack3;

public class CorporateAccount  extends Account{

	@Override
	public void accountOpen() {
		System.out.println("Corporate account open");
	}

	@Override
	public void accountClose() {
		System.out.println("Corporate account close");
	}

}
