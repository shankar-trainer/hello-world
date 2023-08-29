
public class Class1 {

	int addition(int a, int b) {
		return a+b;
	}
	
	Class1 hello() {
		return new Class1();
	}
	
}

class Class2 extends Class1{
	
	@Override
	int  addition(int a, int b) {
		return super.addition(a, b);
	}
	@Override
	Class2 hello() {
		return new Class2();  // covariant type 
	}
	
}
class Class3{
	
}