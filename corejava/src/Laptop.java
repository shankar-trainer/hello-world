
public class Laptop  extends Computer{
	
	private String os;
	private String hardDiskSize;
	private  String  ramSize;

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getHardDiskSize() {
		return hardDiskSize;
	}

	public void setHardDiskSize(String hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	
	@Override
	//public
	//protected
	//private
	void computerInformation() {
		super.computerInformation();
		
		System.out.println("\tHard disk "+getHardDiskSize());
		System.out.println("\tRAM  "+getRamSize());
		System.out.println("\tOS "+getOs());
		
	}
	
	public static void main(String[] args) {
	
		Laptop laptop=new Laptop();
		laptop.setComputerId(66667);
		laptop.setComputerModel("dell");
		laptop.setComputerCost(30000.0f);
		
		laptop.setOs("window 10");
		laptop.setHardDiskSize("500 GB");
		laptop.setRamSize("12GB");
		
		laptop.computerInformation();
	}
}
