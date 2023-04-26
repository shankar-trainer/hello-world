//encapsulation + inheritance 
public class Fair {
	private int fairId;
	private String name;
	private String location;

	public Fair(int fairId, String name, String location) {
		super();
		this.fairId = fairId;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Fair [fairId=" + fairId + ", name=" + name + ", location=" + location + "]";
	}
}
