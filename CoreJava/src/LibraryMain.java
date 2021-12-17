
public class LibraryMain {

	public static void main(String[] args) {
		Library library1=new Library(766776,"gandhi library", "new delhi");
		Library library2=new Library(766779,"music library", "new delhi");
		Library library3=new Library(766771,"science library", "new delhi");
		
	//	library1.libraryInfo();
		//library2.libraryInfo();
		//library3.libraryInfo();
	Library.libraryInfo1(library1);
	Library.libraryInfo1(library2);
	Library.libraryInfo1(library3);
	}
}
