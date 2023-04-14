public class Library {

    long  libraryId;
	String libraryName;
	int libraryCapacity;
	   
	   // default constructor 
	public Library() {
		libraryId=989898;
		libraryName="java library";
		libraryCapacity=100;
	  System.out.println("default constructor called");
	}

	void libraryInfo() {
		System.out.println("----- library information-------");
		System.out.println("\tid is "+libraryId);
		System.out.println("\tname is "+libraryName);
		System.out.println("\tcapacity is "+libraryCapacity);
	}
	
	public Library(long libraryId, String libraryName) {
		  System.out.println("overloaded constructor  with 2 arguments ");	
		  this.libraryId=libraryId;
		  this.libraryName=libraryName;
	}
	
	public Library(long libraryId, String libraryName, int libraryCapacity) {
		System.out.println("overloaded constructor  with 3 arguments ");	
	
		  this.libraryId=libraryId;
		  this.libraryName=libraryName;
		  this.libraryCapacity=libraryCapacity;
	
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
