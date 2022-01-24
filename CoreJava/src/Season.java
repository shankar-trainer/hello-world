
public class Season {

	public static final int Autumn=1;
	public static final int Winter=2;
	public static final int Summer=3;
	public static final int Rainy=4;
}

interface MySeason{
	int Autumn=1;// public static final
	int Winter=2;
	int Summer=3;
	int Rainy=4;
}

class User2 {
	
	public static void main(String[] args) {
		
		System.out.println("searson is "+MySeason.Autumn);
		System.out.println("searson is "+Season.Winter);
	}
	
}