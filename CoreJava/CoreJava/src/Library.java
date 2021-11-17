
public class Library {

	private int libraryId;
	private String libraryName;

	public void libraryInfo() {
		System.out.println(libraryId + "   " + libraryName);
	}

	public static void main(String[] args) {

		Library library1 = new Library();//  obj1
		Library library2 = new Library();//  obj2

		library1.libraryId = 10001;
		library1.libraryName = "tamil library";

		library2.libraryId = 10002;
		library2.libraryName = "telugu library";

		Library library3 = library1;    // library1, library3 both refers same object (obj1) 
		library3.libraryId=1;     //3 references, 2 objects 

		library1.libraryInfo();
		library2.libraryInfo();
		
		System.out.println("library3 ");
		library3.libraryInfo();
		
		library3=library2;
		
		System.out.println("library3 ");
		library3.libraryInfo();
		
		
		library2=null;
		
		
		
		
	}
}
