public class Bus {

	private int regNo;
	private String name;
	private String route;

	public Bus(int regNo, String name, String route) {
		this.regNo = regNo;
		this.name = name;
		this.route = route;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Bus) {
			Bus b = (Bus) obj;
			if (this.regNo == b.regNo && this.name == b.name && this.route == b.route)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Bus bus1 = new Bus(566565, "dtc", "delhi to noida");
		Bus bus2 = new Bus(566565, "dtc", "delhi to noida");
		// Bus bus2=bus1;

		System.out.println(bus1.equals(bus2));
        
	}

}
