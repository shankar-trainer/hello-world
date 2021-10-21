
public class Foo {

	Bar myBar = new Bar();

	void changeIt(Bar myBar) {
		myBar.barNum = 99;
		
		System.out.println("myBar.barNum in changeIt is " + myBar.barNum);//99

		myBar = new Bar();
		myBar.barNum = 420;

		System.out.println("myBar.barNum in changeIt is now  " + myBar.barNum);//420
	}

	public static void main(String[] args) {
		Foo f = new Foo();
		System.out.println("f.myBar.barNum  is   " + f.myBar.barNum);//28
		f.changeIt(f.myBar);
		System.out.println("f.myBar.barNum after  changeIt is now  " + f.myBar.barNum);//99

	}
}
