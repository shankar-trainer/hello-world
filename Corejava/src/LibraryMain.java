
public class LibraryMain {

	public static void main(String[] args) {
		
		Library library1=new Library();
		Library library2=new Library(776788, "hindi library");
		Library library3=new Library(776781, "science library",76);
		
		
		library1.libraryInfo();
		library2.libraryInfo();
		library3.libraryInfo();
		
	}
}
