public interface BasicPhone {
	String country="India";
	void call();
}

interface Mobile extends BasicPhone{
	void message();
}

interface SmartPhone extends BasicPhone, Mobile{
	void videoCall();
	void mail();
	void netsurfing();
	void gaming();
	void videoPlay();
}
class Phone{
	int serialno;
	float cost;
	String model;
	
	String phoneInfo(){
		
		return "searil no is "+serialno+
				"\ncost is "+cost+
				"\nmodel is "+model;
	}

	public Phone(int serialno, float cost, String model) {
		super();
		this.serialno = serialno;
		this.cost = cost;
		this.model = model;
	}
}

class MyPhone extends Phone implements SmartPhone//, BasicPhone
{

	public MyPhone(int serialno, float cost, String model) {
		super(serialno, cost, model);
		
	}

	@Override
	public void call() {
System.out.println("can call");		
	}

	@Override
	public void message() {
		System.out.println("can message");		
	}

	@Override
	public void videoCall() {
		System.out.println("can  Video call");		
	}

	@Override
	public void mail() {
		System.out.println("can call");
		}

	@Override
	public void netsurfing() {
		System.out.println("can do netsurfing");		
	}

	@Override
	public void gaming() {
		System.out.println("can paly game");		
	}

	@Override
	public void videoPlay() {
		System.out.println("can play video ");		
	}
	public static void main(String[] args) {
		MyPhone myPhone=new MyPhone(6566565,8990.67f,"samsung pro");
		myPhone.phoneInfo();
		
		myPhone.call();
		myPhone.gaming();
		myPhone.mail();;
		myPhone.message();;
		myPhone.netsurfing();;
	System.out.println("country name is "+country);	
		//country="bd";
		
	}
}


class MyPhoneMain{
	
	public static void main(String[] args) {
		MyPhone myPhone=new MyPhone(6566565,8990.67f,"samsung pro");
		System.out.println(myPhone.phoneInfo());
		
		myPhone.call();
		myPhone.gaming();
		myPhone.mail();
		myPhone.message();
		myPhone.netsurfing();
	System.out.println("country name is "+MyPhone.country);	
		//country="bd";
		
	}
}