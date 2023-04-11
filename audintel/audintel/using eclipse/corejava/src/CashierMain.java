
public class CashierMain {

	public static void main(String[] args) {
		Cashier cashier = new Cashier();

		cashier.setEmpId(989898);
		cashier.setEmpName("amrednda bhartendu");
		cashier.setEmpLocation("amrawati");
		cashier.setEmpSalary(67000);
		
		cashier.setWork("transaction");
		cashier.setCompanyName("abcl");
		cashier.setTa(0.08f);
		cashier.setDa(0.09f);
		cashier.setPf(0.05f);

		System.out.println("Employee Information");
		System.out.println("\tid is " + cashier.getEmpId());
		System.out.println("\tname is " + cashier.getEmpName());
		System.out.println("\tsalary is " + cashier.getEmpSalary());
		System.out.println("\tta is " + cashier.getTa());
		System.out.println("\tda is " + cashier.getDa());
		System.out.println("\tpf is " + cashier.getPf());
		System.out.println("\tgross salary is " + cashier.grossSalary());
		System.out.println("\tlocation is " + cashier.getEmpLocation());
		System.out.println("\twork is " + cashier.getWork());
		System.out.println("\tcompany name  is " + cashier.getCompanyName());
	}

}
