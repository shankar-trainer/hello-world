
public class LonaMain {

	public static void main(String[] args) {
		Loan loan1=new Loan();
		
		Loan loan2=new Loan(655665,"agriculture loan",900000,3);
		Loan loan3=new Loan(655667,"business loan",100000,3);
	
		loan1.loanInfo();
		loan2.loanInfo();
		loan3.loanInfo();
	}
}
