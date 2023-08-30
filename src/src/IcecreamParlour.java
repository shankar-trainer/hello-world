
public class IcecreamParlour {

	private int id;
	private String name;

	public IcecreamParlour(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "IcecreamParlour [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		IcecreamParlour parlour = (IcecreamParlour) obj;
		if (parlour instanceof IcecreamParlour) {
			if (parlour.id == this.id && parlour.name == this.name)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 1;
	}
	
	public static void main(String[] args) {
		IcecreamParlour parlour1 = new IcecreamParlour(1001, "krishna ice cream parlour");
		IcecreamParlour parlour2 = new IcecreamParlour(1001, "krishna ice cream parlour");

		System.out.println(parlour1.equals(parlour2));
		System.out.println(parlour1.hashCode());
		System.out.println(parlour2.hashCode());
		
	}

}
