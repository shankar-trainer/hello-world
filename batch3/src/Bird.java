
public class Bird {

	private int birdId;
	private String birdName;
	private String birdColor;

	public Bird(int birdId, String birdName, String birdColor) {
		super();
		this.birdId = birdId;
		this.birdName = birdName;
		this.birdColor = birdColor;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Bird) {
			Bird b = (Bird) obj;
			if (this.birdId == b.birdId && this.birdName == b.birdName && this.birdColor == b.birdColor)
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Birds data" + "\n bird id " + birdId + "\n bird name " + birdName + "\n bird color " + birdColor;
	}

	public static void main(String[] args) {
		Bird bird1 = new Bird(67776, "sparrow", "wheatish");
		Bird bird2 = new Bird(67776, "sparrow", "wheatish");

		System.out.println(bird1);
		System.out.println(bird1.equals(bird2));
	}
}
