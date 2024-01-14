public interface Phone {
   void info(); 
  public abstract  void call(); 
}
interface BasicPhone {
	  void call(); 
	  void message(); 
}
class BudgetMobile implements Phone, BasicPhone{

	@Override
	public void message() {
		System.out.println("budget mobile can message");
	}

	@Override
	public void info() {
		System.out.println("This is budget mobile ");
	}

	@Override
	public void call() {
		System.out.println("budget mobile has calling facility ");
	}
}