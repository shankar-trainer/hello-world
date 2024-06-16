
public class Test1 {

	
	void display(String name) {
		Exception exception = new Exception("invalid name ");
		
		if(name.isBlank())
		try{
			 throw exception;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
			//throw new Exception("invalid name ");
		
	}
	
}
