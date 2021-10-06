package exception;

public class CustomerException  extends 
Exception{
	
	public CustomerException(String msg) {
		super("Error is \n"+msg);
	}
}
