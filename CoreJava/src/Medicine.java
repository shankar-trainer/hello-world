import java.util.Date;

public class Medicine {

	private int medicineREgNo;
	private String medicineName;
	private Date medicineMFD;
//private final float  medicineCost=879.0f;
	private final float medicineCost;
                 //final variable must be initialize inline or inside 
	   //constructor 
	public Medicine() {
		medicineCost = 78.00f;
	}

	public static void main(String[] args) {
		Medicine medicine=new Medicine();
	    medicine.medicineCost=89.00f;
	    
		System.out.println();
	}
}
