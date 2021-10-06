package Lab2;

abstract class Item {
	int unique_id;
	String title;
	int number_of_copies;
	public Item(int unique_id, String title, int number_of_copies) {
		super();
		this.unique_id = unique_id;
		this.title = title;
		this.number_of_copies = number_of_copies;
	}
	public int getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(int unique_id) {
		this.unique_id = unique_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumber_of_copies() {
		return number_of_copies;
	}
	public void setNumber_of_copies(int number_of_copies) {
		this.number_of_copies = number_of_copies;
	}
	
	

}

class Books extends Item {
	public Books(int unique_id, String title, int number_of_copies) {
		super(unique_id, title, number_of_copies);
		 
	}

	String Book_Author;
}

class GeneralArticle extends Item {

	public GeneralArticle(int unique_id, String title, int number_of_copies) {
		super(unique_id, title, number_of_copies);
	 
	}

}

class Videos extends Item {
	public Videos(int unique_id, String title, int number_of_copies) {
		super(unique_id, title, number_of_copies);
		// TODO Auto-generated constructor stub
	}

	void Videos_Years_Release() {

	}
}

class CDs extends Item {
	public CDs(int unique_id, String title, int number_of_copies) {
		super(unique_id, title, number_of_copies);
		// TODO Auto-generated constructor stub
	}

	String musicalGenre;
}