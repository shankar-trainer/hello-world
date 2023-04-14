public class Library {

    long  libraryId;
	String libraryName;
	int libraryCapacity;
	   
	   // default constructor 
	public Library() {
		libraryId=989898;
		libraryName="java library";
		libraryCapacity=100;
	  System.out.println("constructor called");
	}
	
	public static void main(String[] args) {
	  Library library1=new Library();
	
	  library1.libraryId=10001;
	  library1.libraryName="advance java library";
	  library1.libraryCapacity=200;
	  
	  System.out.println(" id is "+library1.libraryId);
	  System.out.println(" name is "+library1.libraryName);
	  System.out.println(" capacity is "+library1.libraryCapacity);
	}
}
