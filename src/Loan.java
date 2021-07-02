
public class Loan {
	private int loanRefNo;
	private String loanName;
	private float loanAmount;
	private int loanDuration;
	
	public int getLoanRefNo() {
		return loanRefNo;
	}

	public String getLoanName() {
		return loanName;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void loanInfo() {
		System.out.println("\nLoan data \n");
		System.out.println("\tloan ref no "+ getLoanRefNo());
		System.out.println("\tloan name "+getLoanName());
		System.out.println("\tloan duration "+getLoanDuration());
		System.out.println("\tloan amount "+getLoanAmount());
	}
	public Loan() {
		loanRefNo=98998;
		loanAmount=120000;
		loanDuration=3;
		loanName="home loan";
		System.out.println("Loan constructor called ");
	}

	public Loan(int loanRefNo, String loanName, float loanAmount, int loanDuration) {
		super();
		this.loanRefNo = loanRefNo;
		this.loanName = loanName;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
	}
}
