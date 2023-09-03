import java.util.Objects;

public class WaterBottle {
	int id;
	String model;

	public WaterBottle(int id, String model) {
		super();
		this.id = id;
		this.model = model;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id, model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WaterBottle other = (WaterBottle) obj;
		return id == other.id && Objects.equals(model, other.model);
	}
	
	public static void main(String[] args) {
  WaterBottle bottle1=new WaterBottle(10001, "palstic bottle");		
  WaterBottle bottle2=new WaterBottle(10001, "palstic bottle");		
	
  System.out.println(bottle1.equals(bottle2));
  System.out.println(bottle1.hashCode());
  System.out.println(bottle2.hashCode());
	}
	
}
