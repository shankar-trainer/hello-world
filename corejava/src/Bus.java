import java.util.Objects;

public class Bus {

	private int busId;
	private String busRoute;
	private float busFare;

//
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Bus) {
//			Bus b=(Bus) obj;
//			if(b.busId==this.busId && b.busFare==this.busFare && 
//					b.busRoute==this.busRoute)
//			return true;
//		}
//		return false;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(busFare, busId, busRoute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return Float.floatToIntBits(busFare) == Float.floatToIntBits(other.busFare) && busId == other.busId
				&& Objects.equals(busRoute, other.busRoute);
	}


	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busRoute=" + busRoute + ", busFare=" + busFare + "]";
	}

	
	public Bus(int busId, String busRoute, float busFare) {
		super();
		this.busId = busId;
		this.busRoute = busRoute;
		this.busFare = busFare;
	}

	public int getBusId() {
		return busId;
	}

	public String getBusRoute() {
		return busRoute;
	}

	public float getBusFare() {
		return busFare;
	}

}
