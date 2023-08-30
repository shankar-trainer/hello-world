public class FootBallSports extends Sports {
	private String location;
	private int teamMemeberCount;

	void info() {
		sportsInfo();
		System.out.println("\t location" + location);
		System.out.println("\t team member count " + teamMemeberCount);
	}

//	@Override
//	void sportsInfo() {
//		super.sportsInfo();
//	}

	@Override
	void welcome() {
		super.welcome();
		System.out.println("greeting from FootBallSports ..");
	}

	public static void main(String[] args) {
		// Sports sports=new Sports();
		FootBallSports sports = new FootBallSports();
		sports.setId(767678);
		sports.setName("foot ball");
		// sports.sportsInfo();
		sports.location = "new delhi";
		sports.teamMemeberCount = 11;
		
		sports.info();
	}
}
